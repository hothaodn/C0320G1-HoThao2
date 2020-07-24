import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {BookingService} from '../../../services/booking/booking.service';
import {ActivatedRoute, Router} from '@angular/router';
import {CustomerService} from '../../../services/customer/customer.service';
import {HotelServiceService} from '../../../services/hotel-service/hotel-service.service';
import {ICustomer} from '../../../model/customer.model';
import {IHotelService} from '../../../model/hotelService.model';

@Component({
  selector: 'app-booking-edit',
  templateUrl: './booking-edit.component.html',
  styleUrls: ['./booking-edit.component.css']
})
export class BookingEditComponent implements OnInit {

  public createForm: FormGroup;
  public message = '';
  public checkOutDate;
  public checkInDate = new Date();
  public idBooking;

  public customerList: ICustomer[];
  public serviceList: IHotelService[];

  constructor(
    public bookingService: BookingService,
    public customerService: CustomerService,
    public hotelServiceService: HotelServiceService,
    public router: Router,
    public activatedRoute: ActivatedRoute
  ) { }

  ngOnInit() {
    this.createForm = new FormGroup({
      codeBooking: new FormControl('', [Validators.required, Validators.pattern('^(BK)-[0-9]{4}$')]),
      codeCustomer: new FormControl('', Validators.required),
      codeService: new FormControl('',[Validators.required, Validators.pattern('^(DV)-[0-9]{4}$')]),
      codeEmployee: new FormControl('',[Validators.required, Validators.pattern('^(NV)-[0-9]{4}$')]),
      checkInDate: new FormControl(''),
      checkOutDate: new FormControl(''),
      codeBookingDetail: new FormControl(''),
      deposit: new FormControl('', Validators.min(0)),
      totalAmount: new FormControl('', Validators.min(0))
    });

    this.activatedRoute.params.subscribe(data => {
      this.idBooking = data.id;
      this.bookingService.getBookingById(this.idBooking).subscribe(bookingToEdit => {
        // console.log('tesstttt ' + bookingToEdit.deposit);
        this.createForm.patchValue(bookingToEdit);
      });
    });

    this.customerService.getAllCustomers().subscribe(data => {
      this.customerList = data;
    });

    this.hotelServiceService.getAllHotelServices().subscribe(data => {
      this.serviceList = data;
    });
  }

  onSubmit() {
    console.table(this.createForm.value);
    this.bookingService.editBooking(this.createForm.value, this.idBooking).subscribe(data => {
      this.router.navigateByUrl('admin/booking/view-all');
    });
  }

  getTotalPayment() {
    const startDate = Number(new Date(this.createForm.value.checkInDate))  ;
    const endDate = Number(new Date(this.createForm.value.checkOutDate));
    const stayDate = (endDate - startDate) / 86400000;
    this.hotelServiceService.getHotelServiceByCode(this.createForm.value.codeService).subscribe(data => {
      this.createForm.patchValue({
        totalAmount: stayDate * data[0].rentalFee
      });
    });
  }

}

import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {Router} from '@angular/router';
import {BookingService} from '../../../services/booking/booking.service';
import {CustomerService} from '../../../services/customer/customer.service';
import {ICustomer} from '../../../model/customer.model';
import {HotelServiceService} from '../../../services/hotel-service/hotel-service.service';
import {IHotelService} from '../../../model/hotelService.model';
import {MatDatepickerInputEvent} from '@angular/material/datepicker';

@Component({
  selector: 'app-booking-create',
  templateUrl: './booking-create.component.html',
  styleUrls: ['./booking-create.component.css']
})
export class BookingCreateComponent implements OnInit {
  // @Output()
  // dateInput: EventEmitter<MatDatepickerInputEvent<D>>;
  public createForm: FormGroup;
  public message = '';
  public checkInDate = new Date();
  public checkOutDate = new Date();

  public customerList: ICustomer[];
  public serviceList: IHotelService[];

  constructor(
    public bookingService: BookingService,
    public customerService: CustomerService,
    public hotelServiceService: HotelServiceService,
    public router: Router
  ) {
  }

  onSubmit() {
    if (this.createForm.valid) {
      console.log(this.createForm.value);
      this.bookingService.addNewBooking(this.createForm.value).subscribe(data => {
        console.log(data);
      });
      this.router.navigateByUrl('/admin/booking/view-all');
      this.message = 'Saved successfully!';
    }
  }

  ngOnInit() {
    this.createForm = new FormGroup({
      codeBooking: new FormControl('', [Validators.required, Validators.pattern('^(BK)-[0-9]{4}$')]),
      codeCustomer: new FormControl('', Validators.required),
      codeService: new FormControl('', [Validators.required, Validators.pattern('^(DV)-[0-9]{4}$')]),
      codeEmployee: new FormControl('', [Validators.required, Validators.pattern('^(NV)-[0-9]{4}$')]),
      checkInDate: new FormControl(''),
      checkOutDate: new FormControl(''),
      codeBookingDetail: new FormControl(''),
      deposit: new FormControl('', Validators.min(0)),
      totalAmount: new FormControl('', Validators.min(0))
    });

    this.customerService.getAllCustomers().subscribe(data => {
      this.customerList = data;
    });

    this.hotelServiceService.getAllHotelServices().subscribe(data => {
      this.serviceList = data;
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

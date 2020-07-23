import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {DatePipe} from "@angular/common";
import {CustomerService} from "../../../services/customer/customer.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-booking-create',
  templateUrl: './booking-create.component.html',
  styleUrls: ['./booking-create.component.css']
})
export class BookingCreateComponent implements OnInit {

  public createForm: FormGroup;
  public message = '';
  public maxDate = new Date();
  public minDate = new Date();
  private datepipe: DatePipe;

  constructor(
    public customerService: CustomerService,
    public router: Router
    // public createForm: FormGroup
  ) { }

  onSubmit() {
    if ( this.createForm.valid ) {
      // this.datepipe.transform(this.createForm.value.dateOfBirth, 'dd/mm/yyyy');
      console.log(this.createForm.value);
      this.customerService.addNewCustomer(this.createForm.value).subscribe(data => {
        console.log(data);
      });
      this.router.navigateByUrl('/admin/customer/view-all');
      this.message = 'Saved successfully!';
    }
  }

  ngOnInit() {
    this.createForm = new FormGroup({
      codeBooking: new FormControl('', [Validators.required, Validators.pattern('^(KH)-[0-9]{4}$')]),
      codeCustomer: new FormControl('', Validators.required),
      // dateOfBirth: new FormControl('', Validators.pattern('^(0[1-9]|[12][0-9]|3[01])\\/(0[1-9]|1[12])\\/[1-9]{4}$')),
      codeService: new FormControl(''),
      codeEmployee: new FormControl(''),
      checkInDate: new FormControl('', Validators.pattern('^[0-9]{9}|[0-9]{12}$')),
      checkOutDate: new FormControl('', Validators.pattern('^(090|091|([\(]84[\)][\+]90)|([\(]84[\)][\+]91))[0-9]{7}$')),
      idBookingDetail: new FormControl('', Validators.email),
      deposit: new FormControl(''),
      totalAmount: new FormControl('')
    });
  }

}

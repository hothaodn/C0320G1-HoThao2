import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {CustomerService} from '../../../services/customer/customer.service';
import { Router } from '@angular/router';
// import {DateAdapter, MAT_DATE_FORMATS, MatDateFormats, NativeDateAdapter} from '@angular/material/core';
// import {APP_DATE_FORMATS, AppDateAdapter} from '../../../format-datepicker';
import {DatePipe} from '@angular/common';

@Component({
  selector: 'app-customer-create',
  templateUrl: './customer-create.component.html',
  styleUrls: ['./customer-create.component.css'],
  // providers: [
  //   {provide: DateAdapter, useClass: AppDateAdapter},
  //   {provide: MAT_DATE_FORMATS, useValue: APP_DATE_FORMATS}
  // ]
})

export class CustomerCreateComponent implements OnInit {

  public createForm: FormGroup;
  public message = '';
  public maxDate = new Date();
  public minDate = new Date(1900,0,1);
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
      codeCustomer: new FormControl('', [Validators.required, Validators.pattern('^(KH)-[0-9]{4}$')]),
      nameCustomer: new FormControl('', Validators.required),
      // dateOfBirth: new FormControl('', Validators.pattern('^(0[1-9]|[12][0-9]|3[01])\\/(0[1-9]|1[12])\\/[1-9]{4}$')),
      dateOfBirth: new FormControl(''),
      gender: new FormControl(''),
      idCard: new FormControl('', Validators.pattern('^[0-9]{9}|[0-9]{12}$')),
      phone: new FormControl('', Validators.pattern('^(090|091|([\(]84[\)][\+]90)|([\(]84[\)][\+]91))[0-9]{7}$')),
      email: new FormControl('', Validators.email),
      typeCustomer: new FormControl(''),
      address: new FormControl(''),
      idBooking: new FormControl(''),
    });
  }

}

import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {CUSTOMERS} from '../../../model/DAO/customerDao';

@Component({
  selector: 'app-customer-create',
  templateUrl: './customer-create.component.html',
  styleUrls: ['./customer-create.component.css']
})
export class CustomerCreateComponent implements OnInit {

  createForm: FormGroup;
  customerList = CUSTOMERS;
  message = '';

  constructor() {
    this.createForm = new FormGroup({
      idCustomer: new FormControl('', [Validators.required, Validators.pattern('^(KH)-[0-9]{4}$')]),
      nameCustomer: new FormControl('', Validators.required),
      dateOfBirth: new FormControl('', Validators.pattern('^(0[1-9]|[12][0-9]|3[01])\\/(0[1-9]|1[12])\\/[1-9]{4}$')),
      gender: new FormControl(''),
      idCard: new FormControl('', Validators.pattern('^[0-9]{9}|[0-9]{12}$')),
      phone: new FormControl('', Validators.pattern('^(090|091|([\(]84[\)][\+]90)|([\(]84[\)][\+]91))[0-9]{7}$')),
      email: new FormControl('', Validators.email),
      typeCustomer: new FormControl(''),
      address: new FormControl(''),
      idBooking: new FormControl(''),
    });
  }

  onSubmit() {
    console.log(this.createForm.value);
    this.customerList.push(this.createForm.value);
    this.message = 'Saved successfully!';
  }

  ngOnInit() {
  }

}

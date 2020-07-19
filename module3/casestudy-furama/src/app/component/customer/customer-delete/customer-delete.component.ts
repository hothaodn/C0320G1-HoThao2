import {Component, Input, OnInit} from '@angular/core';
import {Customer} from '../../../model/customer.model';
import {CUSTOMERS} from '../../../model/DAO/customerDao';

@Component({
  selector: 'app-customer-delete',
  templateUrl: './customer-delete.component.html',
  styleUrls: ['./customer-delete.component.css']
})
export class CustomerDeleteComponent implements OnInit {

  customers = CUSTOMERS;

  // @Input()
  // customer: Customer;

  constructor() { }

  ngOnInit() {
  }

  // deleteCustomer(customer: Customer) {
  //   this.customers.splice(customer);
  // }
}

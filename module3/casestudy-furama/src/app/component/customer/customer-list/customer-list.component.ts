import {Component, Input, OnInit} from '@angular/core';
import {CUSTOMERS} from '../../../model/DAO/customerDao';
import {Customer} from '../../../model/customer.model';

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit {

  customers = CUSTOMERS;

  @Input()
  customerDetail: Customer;
  term: any;

  constructor() { }

  ngOnInit() {
  }

  showCustomerDetails(customer: Customer) {
    this.customerDetail = customer;
  }
}

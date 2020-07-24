import {Component, Input, OnInit} from '@angular/core';
import {ICustomer} from '../../../model/customer.model';
import {CustomerService} from '../../../services/customer/customer.service';

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit {

  public customers: ICustomer[];

  customerDetail: ICustomer;
  term: any;

  constructor(
    public customerService: CustomerService,
  ) {
  }

  ngOnInit() {
    this.customerService.getAllCustomers().subscribe(data => {
      this.customers = data;
      console.log(this.customers);
    });
  }

  showCustomerDetails(customer: ICustomer) {
    this.customerDetail = customer;
    console.log('click edit : ' + this.customerDetail.nameCustomer);
  }

  onDeleteConfirmed(customer: ICustomer) {
    console.table(customer);
    this.customers = this.customers.filter((c) => {
      return c.id !== customer.id;
    });
  }
}

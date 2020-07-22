import {Component, Input, OnInit} from '@angular/core';
import {ICustomer} from '../../../model/customer.model';
import {CustomerService} from '../../../services/customer/customer.service';
import {MatDialog} from '@angular/material/dialog';

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit {

  public customers;

  customerDetail: ICustomer;
  term: any;

  constructor(
    public customerService: CustomerService,
    public dialog: MatDialog
  ) { }

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

  getCustomerById(id: any) {
    this.customerDetail.id = id;
    // console.log('id là  ' + this.customerDetail.id);
  }

  // showDeleteForm(customer: ICustomer) {
  //   this.customerDetail = customer;
  //   console.log('test ở list: ' + this.customerDetail.nameCustomer);
  // }

}

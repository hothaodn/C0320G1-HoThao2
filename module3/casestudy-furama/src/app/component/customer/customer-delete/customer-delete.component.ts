import {Component, Input, OnInit} from '@angular/core';
import {CustomerService} from '../../../services/customer/customer.service';
import {ICustomer} from '../../../model/customer.model';

@Component({
  selector: 'app-customer-delete',
  templateUrl: './customer-delete.component.html',
  styleUrls: ['./customer-delete.component.css']
})
export class CustomerDeleteComponent implements OnInit {
  message = '';

  @Input()
  customerDetail: ICustomer;

  constructor(
    public customerService: CustomerService
  ) { }

  ngOnInit() {
  }

  deleteCustomer(): void {
    console.log('trước delete: ' + this.customerDetail.nameCustomer);
    this.customerService.deleteCustomer(this.customerDetail).subscribe(data => {
      console.log('sau delete: ' + this.customerDetail);
    });
  }
}

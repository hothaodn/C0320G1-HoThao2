import {Component, Input, OnInit, Output, EventEmitter} from '@angular/core';
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
  @Output()
  deleteConfirmed = new EventEmitter<ICustomer>();

  constructor(
    public customerService: CustomerService
  ) { }

  ngOnInit() {
  }

  deleteCustomer(): void {
    this.customerService.deleteCustomer(this.customerDetail).subscribe(data => {
      this.deleteConfirmed.emit(this.customerDetail);
    });
  }
}

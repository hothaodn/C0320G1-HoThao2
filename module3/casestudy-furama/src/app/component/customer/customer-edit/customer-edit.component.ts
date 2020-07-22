import {Component, Input, OnInit} from '@angular/core';
import {ICustomer} from '../../../model/customer.model';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {CustomerService} from '../../../services/customer/customer.service';
import {DatePipe} from '@angular/common';
import {ActivatedRoute, Router} from '@angular/router';

@Component({
  selector: 'app-customer-edit',
  templateUrl: './customer-edit.component.html',
  styleUrls: ['./customer-edit.component.css']
})

export class CustomerEditComponent implements OnInit {

  public createForm: FormGroup;
  public message = '';
  public maxDate = new Date();
  public minDate = new Date(1900,0,1);
  private datepipe: DatePipe;
  public idCustomer;

  @Input()
  customerDetail: ICustomer;

  constructor(
    public customerService: CustomerService,
    public router: Router,
    public activatedRoute: ActivatedRoute
  ) { }

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

    this.activatedRoute.params.subscribe(data => {
      this.idCustomer = data.id;
      this.customerService.getCustomerById(this.idCustomer).subscribe(customerToEdit => {
        this.createForm.patchValue(customerToEdit);
      });
    });
  }

  onSubmit() {
    console.log(this.createForm.value);
    this.customerService.editCustomer(this.createForm.value, this.idCustomer).subscribe(data => {
      this.router.navigateByUrl('admin/customer/view-all');
    });
  }

}

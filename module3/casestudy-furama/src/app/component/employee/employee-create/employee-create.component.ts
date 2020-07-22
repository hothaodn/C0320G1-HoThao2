import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';


@Component({
  selector: 'app-employee-create',
  templateUrl: './employee-create.component.html',
  styleUrls: ['./employee-create.component.css']
})
export class EmployeeCreateComponent implements OnInit {

  createForm: FormGroup;
  // employeeList = EMPLOYEES;
  message = '';

  constructor() {
    this.createForm = new FormGroup({
      idEmployee: new FormControl('', [Validators.required, Validators.pattern('^(NV)-[0-9]{4}$')]),
      nameEmployee: new FormControl('', Validators.required),
      dateOfBirth: new FormControl('', Validators.pattern('^(0[1-9]|[12][0-9]|3[01])\\/(0[1-9]|1[12])\\/[1-9]{4}$')),
      idCard: new FormControl('', Validators.pattern('^[0-9]{9}|[0-9]{12}$')),
      phone: new FormControl('', Validators.pattern('^(090|091|([\(]84[\)][\+]90)|([\(]84[\)][\+]91))[0-9]{7}$')),
      email: new FormControl('', Validators.email),
      educationLevel: new FormControl(''),
      position: new FormControl('', Validators.required),
      salary: new FormControl('', [Validators.min(0), Validators.pattern('[0-9]{1,}')]),
      idBooking: new FormControl(''),
    });
  }

  onSubmit() {
    console.log(this.createForm.value);
    // this.employeeList.push(this.createForm.value);
    this.message = 'Saved successfully!';
  }

  ngOnInit() {
  }

}

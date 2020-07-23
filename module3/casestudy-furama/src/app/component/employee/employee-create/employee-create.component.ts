import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {DatePipe} from '@angular/common';
import {EmployeeService} from '../../../services/employee/employee.service';
import {Router} from '@angular/router';


@Component({
  selector: 'app-employee-create',
  templateUrl: './employee-create.component.html',
  styleUrls: ['./employee-create.component.css']
})
export class EmployeeCreateComponent implements OnInit {

  public createForm: FormGroup;
  public message = '';
  public maxDate = new Date();
  public minDate = new Date(1900,0,1);
  private datepipe: DatePipe;

  constructor(
    public employeeService: EmployeeService,
    public router: Router
  ) {
  }

  onSubmit() {
    if ( this.createForm.valid ) {
      // this.datepipe.transform(this.createForm.value.dateOfBirth, 'dd/mm/yyyy');
      console.log(this.createForm.value);
      this.employeeService.addNewEmployee(this.createForm.value).subscribe(data => {
        console.log(data);
      });
      this.router.navigateByUrl('/admin/employee/view-all');
      this.message = 'Saved successfully!';
    }
  }

  ngOnInit() {
    this.createForm = new FormGroup({
      idEmployee: new FormControl('', [Validators.required, Validators.pattern('^(NV)-[0-9]{4}$')]),
      nameEmployee: new FormControl('', Validators.required),
      dateOfBirth: new FormControl(''),
      idCard: new FormControl('', Validators.pattern('^[0-9]{9}|[0-9]{12}$')),
      phone: new FormControl('', Validators.pattern('^(090|091|([\(]84[\)][\+]90)|([\(]84[\)][\+]91))[0-9]{7}$')),
      email: new FormControl('', Validators.email),
      educationLevel: new FormControl(''),
      position: new FormControl('', Validators.required),
      salary: new FormControl('', [Validators.min(0), Validators.pattern('[0-9]{1,}')]),
      idBooking: new FormControl(''),
    });
  }

}

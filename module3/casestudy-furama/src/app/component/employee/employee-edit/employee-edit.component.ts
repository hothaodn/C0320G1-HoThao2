import {Component, Input, OnInit} from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {DatePipe} from '@angular/common';
import {ActivatedRoute, Router} from '@angular/router';
import {IEmployee} from '../../../model/employee.model';
import {EmployeeService} from '../../../services/employee/employee.service';
import {ICustomer} from "../../../model/customer.model";

@Component({
  selector: 'app-employee-edit',
  templateUrl: './employee-edit.component.html',
  styleUrls: ['./employee-edit.component.css']
})
export class EmployeeEditComponent implements OnInit {

  public createForm: FormGroup;
  public message = '';
  public maxDate = new Date();
  public minDate = new Date(1900,0,1);
  private datepipe: DatePipe;
  public idEmployee;

  @Input()
  employeeDetail: IEmployee;

  constructor(
    public employeeService: EmployeeService,
    public router: Router,
    public activatedRoute: ActivatedRoute
  ) { }

  ngOnInit() {
    this.createForm = new FormGroup({
      codeEmployee: new FormControl('', [Validators.required, Validators.pattern('^(NV)-[0-9]{4}$')]),
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

    this.activatedRoute.params.subscribe(data => {
      this.idEmployee = data.id;
      this.employeeService.getEmployeeById(this.idEmployee).subscribe(employeeToEdit => {
        this.createForm.patchValue(employeeToEdit);
      });
    });
  }

  onSubmit() {
    console.log(this.createForm.value);
    this.employeeService.editEmployee(this.createForm.value, this.idEmployee).subscribe(data => {
      this.router.navigateByUrl('admin/employee/view-all');
    });
  }


}

import {Component, Input, OnInit} from '@angular/core';
import {EMPLOYEES} from '../../../model/DAO/employeeDao';
import {Employee} from '../../../model/employee.model';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {

  employees = EMPLOYEES;

  @Input()
  employeeDetail: Employee;
  term: any;

  constructor() { }

  ngOnInit() {
  }

  showEmployeeDetails(employee: Employee) {
    this.employeeDetail = employee;
  }
}

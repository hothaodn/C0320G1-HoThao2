import {Component, Input, OnInit} from '@angular/core';
import {IEmployee} from '../../../model/employee.model';
import {EmployeeService} from '../../../services/employee/employee.service';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {

  public employees;

  @Input()
  employeeDetail: IEmployee;
  term: any;

  constructor(
    public employeeService: EmployeeService
  ) { }

  ngOnInit() {
    this.employeeService.getAllEmployees().subscribe(data => {
      this.employees = data;
      console.log(this.employees);
    });
  }

  showEmployeeDetails(employee: IEmployee) {
    this.employeeDetail = employee;
  }
}

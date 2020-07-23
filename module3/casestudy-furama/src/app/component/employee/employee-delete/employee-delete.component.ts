import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {IEmployee} from '../../../model/employee.model';
import {EmployeeService} from '../../../services/employee/employee.service';

@Component({
  selector: 'app-employee-delete',
  templateUrl: './employee-delete.component.html',
  styleUrls: ['./employee-delete.component.css']
})
export class EmployeeDeleteComponent implements OnInit {

  message = '';

  @Input()
  employeeDetail: IEmployee;
  @Output()
  deleteConfirmed = new EventEmitter<IEmployee>();

  constructor(
    public employeeService: EmployeeService
  ) { }

  ngOnInit() {
  }

  deleteEmployee(): void {
    this.employeeService.deleteEmployee(this.employeeDetail).subscribe(data => {
    this.deleteConfirmed.emit(this.employeeDetail);
    });
  }

}

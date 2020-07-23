import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  public API = 'http://localhost:3000/employees';

  constructor(
    public http: HttpClient
  ) { }

  getAllEmployees(): Observable<any> {
    return this.http.get(this.API);
  }

  getEmployeeById(id: any) {
    return this.http.get(this.API + `/${id}`);
  }

  addNewEmployee(employee): Observable<any> {
    return this.http.post(this.API, employee);
  }

  deleteEmployee(employee): Observable<any> {
    return this.http.delete(this.API + `/${employee.id}`);
  }

  editEmployee(employee, idEmployee) {
    return this.http.put(this.API + `/${idEmployee}`, employee);
  }
}

import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  public API = 'http://localhost:3000/customers';

  constructor(
    public http: HttpClient
  ) { }

  getAllCustomers(): Observable<any> {
    return this.http.get(this.API);
  }

  getCustomerById(id): Observable<any> {
    return this.http.get(this.API + `/${id}`);
  }

  addNewCustomer(customer): Observable<any> {
    return this.http.post(this.API, customer);
  }

  deleteCustomer(customer): Observable<any> {
    return this.http.delete(this.API + `/${customer.id}`);
  }

  editCustomer(customer, idCustomer): Observable<any> {
    return this.http.put(this.API + `/${idCustomer}`, customer);
  }
}

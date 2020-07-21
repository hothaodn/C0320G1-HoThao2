import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class BookingService {

  public API = 'http://localhost:3000/bookings';

  constructor(
    public http: HttpClient
  ) { }

  getAllBookings(): Observable<any> {
    return this.http.get(this.API);
  }

}

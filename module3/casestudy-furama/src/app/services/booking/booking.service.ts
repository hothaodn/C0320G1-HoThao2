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

  getBookingById(id): Observable<any> {
    return this.http.get(this.API + `/${id}`);
  }

  addNewBooking(booking): Observable<any> {
    return this.http.post(this.API, booking);
  }

  deleteBooking(booking): Observable<any> {
    return this.http.delete(this.API + `/${booking.id}`);
  }

  editBooking(booking, idBooking): Observable<any> {
    return this.http.put(this.API + `/${idBooking}`, booking);
  }

}

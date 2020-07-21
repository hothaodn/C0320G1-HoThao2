import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class HotelServiceService {

  public API = 'http://localhost:3000/hotelservices';
  public API2 = 'http://localhost:3000/accompaniedService';

  constructor(
    public http: HttpClient
  ) { }

  getAllHotelServices(): Observable<any> {
    return this.http.get(this.API);
  }

  getAllAccompaniedServices(): Observable<any> {
    return this.http.get(this.API2);
  }

}

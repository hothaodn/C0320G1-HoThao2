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

  getHotelServiceById(id): Observable<any> {
    return this.http.get(this.API + `/${id}`);
  }

  getHotelServiceByCode(codeService: string): Observable<any> {
    return this.http.get(this.API + `?codeService=` + codeService);
  }
  addNewHotelService(service): Observable<any> {
    return this.http.post(this.API, service);
  }

  deleteHotelService(service): Observable<any> {
    return this.http.delete(this.API + `/${service.id}`);
  }

  editHotelService(service, idService): Observable<any> {
    return this.http.put(this.API + `/${idService}`, service);
  }

// dich vu di kem
  getAllAccompaniedServices(): Observable<any> {
    return this.http.get(this.API2);
  }

  getAccompaniedServicesById(id): Observable<any> {
    return this.http.get(this.API + `/${id}`);
  }
  addNewAccompaniedServices(service): Observable<any> {
    return this.http.post(this.API, service);
  }

  deleteAccompaniedServices(service): Observable<any> {
    return this.http.delete(this.API + `/${service.id}`);
  }

  editAccompaniedServices(service, idService): Observable<any> {
    return this.http.put(this.API + `/${idService}`, service);
  }
}

import {Component, Input, OnInit} from '@angular/core';
import {IHotelService} from '../../../model/hotelService.model';
import {HotelServiceService} from '../../../services/hotel-service/hotel-service.service';

@Component({
  selector: 'app-service-list',
  templateUrl: './service-list.component.html',
  styleUrls: ['./service-list.component.css']
})
export class ServiceListComponent implements OnInit {

  public serviceList;

  serviceDetail: IHotelService;
  term: any;

  constructor(
    public hotelServiceService: HotelServiceService
  ) { }

  ngOnInit() {
    this.hotelServiceService.getAllHotelServices().subscribe(data => {
      this.serviceList = data;
    });
  }

  showServiceDetails(service: IHotelService) {
    this.serviceDetail = service;
  }

  onDeleteConfirmed(service: IHotelService) {
    console.table(service);
    this.serviceList = this.serviceList.filter((c) => {
      return c.id !== service.id;
    });
  }
}

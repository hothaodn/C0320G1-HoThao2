import {Component, Input, OnInit} from '@angular/core';
import {SERVICES} from '../../../model/DAO/hotelServiceDao';
import {HotelService} from '../../../model/hotelService.model';

@Component({
  selector: 'app-service-list',
  templateUrl: './service-list.component.html',
  styleUrls: ['./service-list.component.css']
})
export class ServiceListComponent implements OnInit {

  serviceList = SERVICES;

  @Input()
  serviceDetail: HotelService;
  term: any;

  constructor() { }

  ngOnInit() {
  }

  showServiceDetails(service: HotelService) {
    this.serviceDetail = service;
  }
}

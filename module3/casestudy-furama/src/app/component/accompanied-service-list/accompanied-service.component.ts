import { Component, OnInit } from '@angular/core';
import {HotelServiceService} from '../../services/hotel-service/hotel-service.service';

@Component({
  selector: 'app-accompanied-service',
  templateUrl: './accompanied-service.component.html',
  styleUrls: ['./accompanied-service.component.css']
})
export class AccompaniedServiceComponent implements OnInit {

  public accomServiceList;

  constructor(
    public hotelServiceService: HotelServiceService
  ) { }

  ngOnInit() {
    this.hotelServiceService.getAllAccompaniedServices().subscribe(data => {
      this.accomServiceList = data;
    });
  }

}

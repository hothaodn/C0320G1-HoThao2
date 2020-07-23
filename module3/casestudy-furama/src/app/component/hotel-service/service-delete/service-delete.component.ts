import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {IHotelService} from '../../../model/hotelService.model';
import {HotelServiceService} from '../../../services/hotel-service/hotel-service.service';

@Component({
  selector: 'app-service-delete',
  templateUrl: './service-delete.component.html',
  styleUrls: ['./service-delete.component.css']
})
export class ServiceDeleteComponent implements OnInit {

  message = '';

  @Input()
  serviceDetail: IHotelService;
  @Output()
  deleteConfirmed = new EventEmitter<IHotelService>();

  constructor(
    public hotelServiceService: HotelServiceService
  ) { }

  ngOnInit() {
  }

  deleteCustomer(): void {
    this.hotelServiceService.deleteHotelService(this.serviceDetail).subscribe(data => {
    this.deleteConfirmed.emit(this.serviceDetail);
    });
  }

}

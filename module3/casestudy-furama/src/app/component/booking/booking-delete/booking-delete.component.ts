import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {BookingService} from '../../../services/booking/booking.service';
import {IBooking} from '../../../model/booking.model';

@Component({
  selector: 'app-booking-delete',
  templateUrl: './booking-delete.component.html',
  styleUrls: ['./booking-delete.component.css']
})
export class BookingDeleteComponent implements OnInit {

  message = '';

  @Input()
  bookingDetail: IBooking;
  @Output()
  deleteConfirmed = new EventEmitter<IBooking>();

  constructor(
    public bookingService: BookingService
  ) { }

  ngOnInit() {
  }

  deleteBooking(): void {
    this.bookingService.deleteBooking(this.bookingDetail).subscribe(data => {
    this.deleteConfirmed.emit(this.bookingDetail);
    });
  }

}

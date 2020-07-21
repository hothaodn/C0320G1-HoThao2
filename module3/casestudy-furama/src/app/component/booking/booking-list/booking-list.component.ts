import {Component, Input, OnInit} from '@angular/core';
import {Booking} from '../../../model/booking.model';
import {BookingService} from '../../../services/booking/booking.service';

@Component({
  selector: 'app-booking-list',
  templateUrl: './booking-list.component.html',
  styleUrls: ['./booking-list.component.css']
})
export class BookingListComponent implements OnInit {

  public bookingList;

  @Input()
  bookingDetail: Booking;
  term: any;

  constructor(
    public bookingService: BookingService
  ) { }

  ngOnInit() {
    this.bookingService.getAllBookings().subscribe(data => {
      this.bookingList = data;
    });
  }

  showBookingDetails(booking: Booking) {
    this.bookingDetail = booking;
  }
}

import {Component, Input, OnInit} from '@angular/core';
import {IBooking} from '../../../model/booking.model';
import {BookingService} from '../../../services/booking/booking.service';
import {DatePipe} from '@angular/common';
import {HotelServiceService} from '../../../services/hotel-service/hotel-service.service';

@Component({
  selector: 'app-booking-list',
  templateUrl: './booking-list.component.html',
  styleUrls: ['./booking-list.component.css']
})
export class BookingListComponent implements OnInit {

  public bookingList;
  public today = new Date();
  public checkInTodayList;
  public payment;

  @Input()
  bookingDetail: IBooking;
  term: any;
  private DateTimeFormatter: any;

  constructor(
    public bookingService: BookingService,
    public hotelServiceService: HotelServiceService
  ) {
  }

  ngOnInit() {
    this.bookingService.getAllBookings().subscribe(data => {
      this.bookingList = data;
    });
  }

  showBookingDetails(booking: IBooking) {
    this.bookingDetail = booking;
  }

  // transform(value: string) {
  //   const datePipe = new DatePipe('en-US');
  //   value = datePipe.transform(value, 'dd/MM/yyyy');
  //   return value;
  // }

  showBookingToday(): void {
    this.checkInTodayList = [];
    for (let i = 0; i < this.bookingList.length; i++) {
      const checkInDateConverted = new Date(this.bookingList[i].checkInDate);
      const checkOutDateConverted = new Date(this.bookingList[i].checkOutDate);

      if ( this.today >= checkInDateConverted && this.today < checkOutDateConverted ) {
        console.table(this.bookingList[i]);
        this.checkInTodayList.push(this.bookingList[i]);
      }
    }
  }
}


export interface IBooking {
  id: number;
  codeBooking: string;
  codeCustomer: string;
  codeService: string;
  codeEmployee: string;
  checkInDate: string;
  checkOutDate: string;
  codeBookingDetail: string[];
  deposit: number;
  totalAmount: number;
}

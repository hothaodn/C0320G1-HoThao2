export class Booking {
  id: number;
  codeBooking: string;
  codeCustomer: string;
  codeService: string;
  codeEmployee: string;
  checkInDate: string;
  checkOutDate: string;
  idBookingDetail: string[];
  deposit: number;
  totalAmount: number;
}

// Hợp đồng thuê sẽ bao gồm các thông tin: Số hợp đồng, Ngày bắt đầu,
// Ngày kết thúc, Số tiền cọc trước, Tổng số tiền thanh toán.

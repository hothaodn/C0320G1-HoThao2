export class BookingModel {
  idBooking: string;
  checkInDate: number;
  checkOutDate: number;
  deposit: number;
  totalAmount: number;
  idCustomer: string;
  idService: string;
  idEmployee: string;
}

// Hợp đồng thuê sẽ bao gồm các thông tin: Số hợp đồng, Ngày bắt đầu,
// Ngày kết thúc, Số tiền cọc trước, Tổng số tiền thanh toán.

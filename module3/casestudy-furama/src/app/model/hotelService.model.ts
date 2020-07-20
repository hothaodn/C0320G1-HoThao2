export class HotelService {
  idService: string;
  nameService: string;
  areaUsing: number;
  rentalFee: number;
  maxOccupancies: number; //so khach toi da o moi phong
  rentalType: string;
  roomStandard: string;
  facilities: string;
  numberOfFloor: number;
  areaSwimmingPool: number;
  freeService: string;
}

// Tất cả các dịch vụ này sẽ bao có các thông tin: Tên dịch vụ, Diện tích sử dụng, Chi phí thuê, Số lượng người tối đa, Kiểu thuê (bao gồm thuê theo năm, tháng, ngày, giờ).
// -	Riêng Villa sẽ có thêm thông tin: Tiêu chuẩn phòng, Mô tả tiện nghi khác, Diện tích hồ bơi, Số tầng.
// -	Riêng House sẽ có thêm thông tin: Tiêu chuẩn phòng, Mô tả tiện nghi khác, Số tầng.
// -	Riêng Phòng sẽ có thêm thông tin: Dịch vụ miễn phí đi kèm.
//

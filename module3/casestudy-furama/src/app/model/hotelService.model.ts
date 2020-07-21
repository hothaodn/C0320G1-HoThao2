export interface IHotelService {
  id: number;
  codeService: string;
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

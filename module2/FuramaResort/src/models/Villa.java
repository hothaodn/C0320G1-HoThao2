package models;

public class Villa extends Services {
    //-	Riêng Villa sẽ có thêm thông tin: Tiêu chuẩn phòng, Mô tả tiện nghi khác, Diện tích hồ bơi, Số tầng
    private Float roomStandard;
    private Float facilites;
    private Float areaSwimmingPool;
    private int numberOfFloor;

    public Villa() {
    }

    public Villa(Float roomStandard, Float facilites, Float areaSwimmingPool, int numberOfFloor) {
        this.roomStandard = roomStandard;
        this.facilites = facilites;
        this.areaSwimmingPool = areaSwimmingPool;
        this.numberOfFloor = numberOfFloor;
    }

    public Villa(Float id, Float serviceName, float areaUsing, double rentalFee, int maxOccupancy, Float typeRental, Float roomStandard, Float facilites, Float areaSwimmingPool, int numberOfFloor) {
        super(id, serviceName, areaUsing, rentalFee, maxOccupancy, typeRental);
        this.roomStandard = roomStandard;
        this.facilites = facilites;
        this.areaSwimmingPool = areaSwimmingPool;
        this.numberOfFloor = numberOfFloor;
    }

    public Float getRoomStandard() {
        return roomStandard;
    }

    public Float getFacilites() {
        return facilites;
    }

    public Float getAreaSwimmingPool() {
        return areaSwimmingPool;
    }

    public int getnumberOfFloor() {
        return numberOfFloor;
    }

    public void setRoomStandard(Float roomStandard) {
        this.roomStandard = roomStandard;
    }

    public void setFacilites(Float facilites) {
        this.facilites = facilites;
    }

    public void setAreaSwimmingPool(Float areaSwimmingPool) {
        this.areaSwimmingPool = areaSwimmingPool;
    }

    public void setnumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String showInfor() {
        return "***************** VILLA *****************" + super.toString() +
                "\nRoomStandard: " + roomStandard
                +"\nFacilities: " + facilites
                +"\nArea of SwimmingPool: " + areaSwimmingPool
                +"\nNumber of Floor: " + numberOfFloor;
    }
}

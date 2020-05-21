package models;

public class Villa extends Services {
    //-	Riêng Villa sẽ có thêm thông tin: Tiêu chuẩn phòng, Mô tả tiện nghi khác, Diện tích hồ bơi, Số tầng
    private String roomStandard = "Luxury";
    private String facilites = "Deluxe";
    private String areaSwimmingPool = "20 m2";
    private int numberOfFloor = 3;

    public Villa() {
    }

    public Villa(String roomStandard, String facilites, String areaSwimmingPool, int numberOfFloor) {
        this.roomStandard = roomStandard;
        this.facilites = facilites;
        this.areaSwimmingPool = areaSwimmingPool;
        this.numberOfFloor = numberOfFloor;
    }

    public Villa(String id, String serviceName, float areaUsing, double rentalFee, int maxOccupancy, String typeRental, String roomStandard, String facilites, String areaSwimmingPool, int numberOfFloor) {
        super(id, serviceName, areaUsing, rentalFee, maxOccupancy, typeRental);
        this.roomStandard = roomStandard;
        this.facilites = facilites;
        this.areaSwimmingPool = areaSwimmingPool;
        this.numberOfFloor = numberOfFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public String getFacilites() {
        return facilites;
    }

    public String getAreaSwimmingPool() {
        return areaSwimmingPool;
    }

    public int getnumberOfFloor() {
        return numberOfFloor;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public void setFacilites(String facilites) {
        this.facilites = facilites;
    }

    public void setAreaSwimmingPool(String areaSwimmingPool) {
        this.areaSwimmingPool = areaSwimmingPool;
    }

    public void setnumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String showInfor() {
        return "Villa{" + super.toString() +
                "roomStandard='" + roomStandard + '\'' +
                ", facilites='" + facilites + '\'' +
                ", areaSwimmingPool=" + areaSwimmingPool +
                ", numberOfFloor=" + numberOfFloor +
                '}';
    }
}

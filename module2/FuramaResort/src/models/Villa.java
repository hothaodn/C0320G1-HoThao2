package models;

public class Villa extends Services {
    //-	Riêng Villa sẽ có thêm thông tin: Tiêu chuẩn phòng, Mô tả tiện nghi khác, Diện tích hồ bơi, Số tầng
    private String roomStandard = "Luxury";
    private String facilites = "Deluxe";
    private String areaSwimmingPool = "20 m2";
    private int floorNumber = 3;

    public Villa() {
    }

    public Villa(String roomStandard, String facilites, String areaSwimmingPool, int floorNumber) {
        this.roomStandard = roomStandard;
        this.facilites = facilites;
        this.areaSwimmingPool = areaSwimmingPool;
        this.floorNumber = floorNumber;
    }

    public Villa(String id, String serviceName, float areaUsing, double roomRates, int guestNumberMax, String typeRental, String roomStandard, String facilites, String areaSwimmingPool, int floorNumber) {
        super(id, serviceName, areaUsing, roomRates, guestNumberMax, typeRental);
        this.roomStandard = roomStandard;
        this.facilites = facilites;
        this.areaSwimmingPool = areaSwimmingPool;
        this.floorNumber = floorNumber;
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

    public int getFloorNumber() {
        return floorNumber;
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

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    @Override
    public String showInfor() {
        return "Villa{" + super.toString() +
                "roomStandard='" + roomStandard + '\'' +
                ", facilites='" + facilites + '\'' +
                ", areaSwimmingPool=" + areaSwimmingPool +
                ", floorNumber=" + floorNumber +
                '}';
    }
}

package models;

public class House extends Services {
    //-	Riêng House sẽ có thêm thông tin: Tiêu chuẩn phòng, Mô tả tiện nghi khác, Số tầng.
    private String roomStandard;
    private String facilites;
    private int floorNumber;

    public House() {
    }

    public House(String roomStandard, String facilites, int floorNumber) {
        this.roomStandard = roomStandard;
        this.facilites = facilites;
        this.floorNumber = floorNumber;
    }

    public House(String id, String serviceName, float areaUsing, double roomRates, int guestNumberMax, String typeRental, String roomStandard, String facilites, int floorNumber) {
        super(id, serviceName, areaUsing, roomRates, guestNumberMax, typeRental);
        this.roomStandard = roomStandard;
        this.facilites = facilites;
        this.floorNumber = floorNumber;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public String getFacilites() {
        return facilites;
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

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    @Override
    public String showInfor() {
        return "House{" + super.toString() +
                "roomStandard='" + roomStandard + '\'' +
                ", facilites='" + facilites + '\'' +
                ", floorNumber=" + floorNumber +
                '}';
    }
}

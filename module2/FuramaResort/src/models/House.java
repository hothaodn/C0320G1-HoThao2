package models;

public class House extends Services {
    //-	Riêng House sẽ có thêm thông tin: Tiêu chuẩn phòng, Mô tả tiện nghi khác, Số tầng.
    private String roomStandard;
    private String facilites;
    private int numberOfFloor;

    public House() {
    }

    public House(String roomStandard, String facilites, int numberOfFloor) {
        this.roomStandard = roomStandard;
        this.facilites = facilites;
        this.numberOfFloor = numberOfFloor;
    }

    public House(String id, String serviceName, float areaUsing, double rentalFee, int maxOccupancy, String typeRental, String roomStandard, String facilites, int numberOfFloor) {
        super(id, serviceName, areaUsing, rentalFee, maxOccupancy, typeRental);
        this.roomStandard = roomStandard;
        this.facilites = facilites;
        this.numberOfFloor = numberOfFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public String getFacilites() {
        return facilites;
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

    public void setnumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String showInfor() {
        return "***************** HOUSE *****************" + super.toString() +
                "\nRoom Standard: " + roomStandard
                +"\nFacilities: " + facilites
                +"\nNumber of Floor: " + numberOfFloor;
    }
}

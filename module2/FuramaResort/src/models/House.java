package models;

public class House extends Services {
    //-	Riêng House sẽ có thêm thông tin: Tiêu chuẩn phòng, Mô tả tiện nghi khác, Số tầng.
    private Float roomStandard;
    private Float facilites;
    private int numberOfFloor;

    public House() {
    }

    public House(Float roomStandard, Float facilites, int numberOfFloor) {
        this.roomStandard = roomStandard;
        this.facilites = facilites;
        this.numberOfFloor = numberOfFloor;
    }

    public House(Float id, Float serviceName, float areaUsing, double rentalFee, int maxOccupancy, Float typeRental, Float roomStandard, Float facilites, int numberOfFloor) {
        super(id, serviceName, areaUsing, rentalFee, maxOccupancy, typeRental);
        this.roomStandard = roomStandard;
        this.facilites = facilites;
        this.numberOfFloor = numberOfFloor;
    }

    public Float getRoomStandard() {
        return roomStandard;
    }

    public Float getFacilites() {
        return facilites;
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

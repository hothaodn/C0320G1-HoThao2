package models;

public class Room extends Services {
    //-	Riêng Phòng sẽ có thêm thông tin: Dịch vụ miễn phí đi kèm.
    private Float complimentary;

    public Room() {
    }

    public Room(Float complimentary) {
        this.complimentary = complimentary;
    }

    public Room(Float id, Float serviceName, float areaUsing, double rentalFee, int maxOccupancy, Float typeRental, Float complimentary) {
        super(id, serviceName, areaUsing, rentalFee, maxOccupancy, typeRental);
        this.complimentary = complimentary;
    }


    public Float getComplimentary() {
        return complimentary;
    }

    public void setComplimentary(Float complimentary) {
        this.complimentary = complimentary;
    }

    @Override
    public String showInfor() {
        return "***************** ROOM *****************" + super.toString() +
                "\nComplimentary: " + complimentary;
    }

}

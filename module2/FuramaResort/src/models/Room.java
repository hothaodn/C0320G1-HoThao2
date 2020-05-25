package models;

public class Room extends Services {
    //-	Riêng Phòng sẽ có thêm thông tin: Dịch vụ miễn phí đi kèm.
    private String complimentary;

    public Room() {
    }

    public Room(String complimentary) {
        this.complimentary = complimentary;
    }

    public Room(String id, String serviceName, float areaUsing, double rentalFee, int maxOccupancy, String typeRental, String complimentary) {
        super(id, serviceName, areaUsing, rentalFee, maxOccupancy, typeRental);
        this.complimentary = complimentary;
    }


    public String getComplimentary() {
        return complimentary;
    }

    public void setComplimentary(String complimentary) {
        this.complimentary = complimentary;
    }

    @Override
    public String showInfor() {
        return "***************** ROOM *****************" + super.toString() +
                "\nComplimentary: " + complimentary;
    }

}

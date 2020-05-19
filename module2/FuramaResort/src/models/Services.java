package models;

public abstract class Services {
    /*1.	Xây dựng abstract class Services (dịch vụ) bao gồm các thông tin chung
     của tất cả dịch vụ cho thuê Villa, House, Room.
(trong class Services lưu ý thêm thuộc tính id kiểu dữ liệu String và các class này
được tạo trong package models)
*/
    private String id;
    private String serviceName;
    private float areaUsing;
    private double roomRates;
    private int guestNumberMax;
    private String typeRental;

    public Services() {
    }

    public Services(String id, String serviceName, float areaUsing, double roomRates, int guestNumberMax, String typeRental) {
        this.id = id;
        this.serviceName = serviceName;
        this.areaUsing = areaUsing;
        this.roomRates = roomRates;
        this.guestNumberMax = guestNumberMax;
        this.typeRental = typeRental;
    }

    public String getId() {
        return id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public float getAreaUsing() {
        return areaUsing;
    }

    public double getRoomRates() {
        return roomRates;
    }

    public int getGuestNumberMax() {
        return guestNumberMax;
    }

    public String getTypeRental() {
        return typeRental;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setAreaUsing(float areaUsing) {
        this.areaUsing = areaUsing;
    }

    public void setRoomRates(double roomRates) {
        this.roomRates = roomRates;
    }

    public void setGuestNumberMax(int guestNumberMax) {
        this.guestNumberMax = guestNumberMax;
    }

    public void setTypeRental(String typeRental) {
        this.typeRental = typeRental;
    }

    public abstract String showInfor();

    public String toString() {
        return "Services{" +
                "id='" + id + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", areaUsing=" + areaUsing +
                ", roomRates=" + roomRates +
                ", guestNumberMax=" + guestNumberMax +
                ", typeRental='" + typeRental + '\'' +
                '}';
    }
}

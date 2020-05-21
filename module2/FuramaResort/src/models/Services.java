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
    private double rentalFee;
    private int maxOccupancy;
    private String typeRental;

    public Services() {
    }

    public Services(String id, String serviceName, float areaUsing, double rentalFee, int maxOccupancy, String typeRental) {
        this.id = id;
        this.serviceName = serviceName;
        this.areaUsing = areaUsing;
        this.rentalFee = rentalFee;
        this.maxOccupancy = maxOccupancy;
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

    public double getrentalFee() {
        return rentalFee;
    }

    public int getmaxOccupancy() {
        return maxOccupancy;
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

    public void setrentalFee(double rentalFee) {
        this.rentalFee = rentalFee;
    }

    public void setmaxOccupancy(int maxOccupancy) {
        this.maxOccupancy = maxOccupancy;
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
                ", rentalFee=" + rentalFee +
                ", maxOccupancy=" + maxOccupancy +
                ", typeRental='" + typeRental + '\'' +
                '}';
    }
}

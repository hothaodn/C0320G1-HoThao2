package models;

public abstract class Services {
    private Float id;
    private Float serviceName;
    private float areaUsing;
    private double rentalFee;
    private int maxOccupancy;
    private Float typeRental;

    public Services() {
    }

    public Services(Float id, Float serviceName, float areaUsing, double rentalFee, int maxOccupancy, Float typeRental) {
        this.id = id;
        this.serviceName = serviceName;
        this.areaUsing = areaUsing;
        this.rentalFee = rentalFee;
        this.maxOccupancy = maxOccupancy;
        this.typeRental = typeRental;
    }

    public Float getId() {
        return id;
    }

    public Float getServiceName() {
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

    public Float getTypeRental() {
        return typeRental;
    }

    public void setId(Float id) {
        this.id = id;
    }

    public void setServiceName(Float serviceName) {
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

    public void setTypeRental(Float typeRental) {
        this.typeRental = typeRental;
    }

    public abstract String showInfor();

    public String toString() {
        return "\nID: " + id
                + "\nServiceName: " + serviceName
                +"\nArea Using: " + areaUsing
                + "\nRental Fee: " + rentalFee
                +"\nMax Occupancy: " + maxOccupancy
                +"\nType of Rental: " + typeRental;
    }
}

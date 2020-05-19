package models;

public abstract class AccompaniedService {
    //Tên dịch vụ đi kèm, Đơn vị, Giá tiền
    private String accompaniedServiceName;
    private float accompaniedServiceUnit;
    private double accompaniedServicePrice;

    public abstract float paymentAccompaniedService();
}

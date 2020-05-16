package heCacDoiTuongHinhHoc;

public class Square extends Rectangle {
    double side;
    public Square(){
    }

    public Square( double side){
        this.side = side;
    }

    public Square( double side){
        super(String color,boolean filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


}

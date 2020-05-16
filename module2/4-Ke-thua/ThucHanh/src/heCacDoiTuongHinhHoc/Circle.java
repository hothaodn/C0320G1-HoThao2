package heCacDoiTuongHinhHoc;

public class Circle extends Shape {
    double radius = 1.0;
    static final double pi = Math.PI;
    public Circle(){
    }
    public Circle(double radius){
        super(String color,boolean filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return 2*pi*this.radius,2;
    }
    public double getPerimeter(){
        return pi*Math.pow(this.radius,2);
    }
    public String toString(){
        return "A Circle with radius= " + this.radius + " which is a subclass of yyy";
    }
}

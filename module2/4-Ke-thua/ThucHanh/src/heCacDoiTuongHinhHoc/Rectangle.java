package heCacDoiTuongHinhHoc;

public class Rectangle extends Shape {
    double width = 1.0;
    double length = 1.0;
    public Rectangle;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length) {
        super(String color, boolean filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return this.width*this.length;
    }

    public double getPerimeter(){
        return (this.width+this.length)*2;
    }

    public String toString(){
        return "A Rectangle with width=xxx and length= " +this.length+ " which is a subclass of yyy";
    }
}

package circleAndCylinder;

public class Circle {
    private double radius = 9;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPerimeter(){
        return 2*Math.PI*this.radius;
    }

    public double getArea(){
        return Math.PI*Math.pow(this.radius,2);
    }

    public String toString(){
        return "Perimeter of the circle is " + getPerimeter() + " and area is " + getArea()
                + "\nRadius: " + this.radius;
    }
}

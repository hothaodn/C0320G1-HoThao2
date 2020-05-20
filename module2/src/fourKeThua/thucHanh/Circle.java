package fourKeThua.thucHanh;

public class Circle extends Shape {
    double radius = 1.0;

    public Circle(){
    }

    public Circle(String color, boolean filled,double radius){
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return 2*Math.PI*this.radius;
    }
    public double getPerimeter(){
        return Math.PI*Math.pow(this.radius,2);
    }
    @Override
    public String toString(){
        return "A Circle with radius= " + this.radius + " which is a subclass of "+ super.toString();
    }
}
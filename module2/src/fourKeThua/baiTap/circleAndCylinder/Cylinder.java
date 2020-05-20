package fourKeThua.baiTap.circleAndCylinder;

public class Cylinder extends Circle {
    private double height = 10;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getVolume(){
        return super.getArea()*2*this.height;
    }

    @Override
    public String toString(){
        return "Perimeter of the cylinder is " + getVolume() + "\nwith infomation of circle: " + super.toString();
    }
}

package xayDungLopFan;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";
    private String name;

    public Fan() {
    }
    public Fan(String name, double radius, String color) {
        this.name = name;
        this.radius = radius;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getSpeed(int speed) {
        switch (speed){
            case 1:
                this.speed = SLOW;
                break;
            case 2:
                this.speed = MEDIUM;
                break;
            case 3:
                this.speed = FAST;
                break;
        }
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String isOn() {
        if(on == true){
            return "Fan is ON";
        }else{
            return "Fan is OFF";
        }
    }

    public void setOn(boolean on) {
        this.on = on;
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

    public String toString(){
        return "------->> This is " + name + " <<-------\nStatus: " + isOn() +"\nColor: " + color +"\nRadius: "+ radius+ "\nSpeed: "+speed;
    }
}

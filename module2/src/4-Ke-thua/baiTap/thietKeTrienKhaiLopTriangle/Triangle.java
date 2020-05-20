import java.util.Scanner;

public class Triangle extends Shape {
    private double side1 = 1;
    private double side2 = 1;
    private double side3 = 1;
    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getPerimeter(){
        if(checkValidTriangle()){
            return (this.side1 + this.side2 + this.side3);
        }return 0;
    }

    public double getArea(){
        if(checkValidTriangle()){
            double p = this.getPerimeter()/2;
            return Math.sqrt(p*(p- this.side1)*(p- this.side2)*(p- this.side3));
        }return 0;
    }

    public String toString(){
        return "Triangle has length of 3 side " + this.side1 + ", " +this.side2 + ", " + this.side3
                + " with area " + this.getArea() + " with perimeter " + this.getPerimeter();
    }

    public void input(){
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input side 1: ");
            this.side1 = scanner.nextDouble();
            System.out.println("Input side 2: ");
            this.side2 = scanner.nextDouble();
            System.out.println("Input side 3: ");
            this.side3 = scanner.nextDouble();
        }while (!this.checkValidTriangle());
    }
    public boolean checkValidTriangle(){
        if(this.side1 + this.side2 > this.side3 && this.side2 + this.side3 > this.side1 && this.side1 + this.side3 > this.side2){
            return true;
        }else{
            return false;
        }
    }
}

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {
    }
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void input(){
        Scanner input1 = new Scanner(System.in);
        System.out.println("Input a: ");
        a = input1.nextDouble();
        System.out.println("Input b: ");
        b = input1.nextDouble();
        System.out.println("Input c: ");
        c = input1.nextDouble();
        }

    double getDiscriminant() {
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    double getRoot1() {
        return (-this.b + Math.sqrt(this.getDiscriminant())) / (2 * this.a);
    }

    double getRoot2() {
        return (-this.b - Math.sqrt(this.getDiscriminant())) / (2 * this.a);
    }

    public void getSolution() {
        System.out.println(a + "X2 + " + b + "X + "+ c + " = 0");
        if (this.a != 0) {
            if (this.getDiscriminant() > 0) {
                System.out.println("2 separated roots: " + this.getRoot1() + " and " + this.getRoot2());
            } else if (this.getDiscriminant() == 0) {
                System.out.println("Dual roots: " + this.getRoot1());
            } else {
                System.out.println("The equation has no roots");
            }
        } else {
            if (this.b == 0 && this.c == 0) {
                System.out.println("The equation has countless roots");
            }else if (this.b == 0 && this.c != 0) {
                System.out.println("The equation has no roots");
            }
        }
    }
}


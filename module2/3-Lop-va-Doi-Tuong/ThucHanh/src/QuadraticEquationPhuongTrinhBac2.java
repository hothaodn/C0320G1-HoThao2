import java.util.Scanner;

public class QuadraticEquationPhuongTrinhBac2 {
    public static void main(String[] args) {
        double a,b,c;
        Scanner input1 = new Scanner(System.in);
        System.out.println("Input a: ");
        a = input1.nextDouble();
        System.out.println("Input b: ");
        b = input1.nextDouble();
        System.out.println("Input c: ");
        c = input1.nextDouble();
        Account phuongTrinhBac2 = new Account(a,b,c);
        double delta = phuongTrinhBac2.getDiscriminant();
        if( a != 0 ){
            if( phuongTrinhBac2.getDiscriminant() > 0 ){
                System.out.println("2 separated roots: " + phuongTrinhBac2.getRoot1() + " and " + phuongTrinhBac2.getRoot2());
            }else if(phuongTrinhBac2.getDiscriminant() == 0){
                System.out.println("Dual roots: " + phuongTrinhBac2.getRoot1());
            }else{
                System.out.println("The equation has no roots");
            }
        }else if( b == 0 && c == 0){
            System.out.println("The equation has countless roots");
        }else if( b != 0){
            System.out.println("Only one root: " + (-c/b));
        }else{
            System.out.println("The equation has no roots");
        }
    }
    public static class Account{
        private double a,b,c;
        Account(double a, double b, double c){
            this.a = a;
            this.b = b;
            this.c = c;
        }
        double getA(){
            return this.a;
        }
        double getB(){
            return this.b;
        }
        double getC(){
            return this.c;
        }
        double getDiscriminant(){
                return Math.pow(this.b,2) - 4*this.a*this.c;
        }
        double getRoot1(){
            return (-this.b + Math.sqrt(this.getDiscriminant())/(2*this.a));
        }
        double getRoot2(){
            return (-this.b - Math.sqrt(this.getDiscriminant())/(2*this.a));
        }
        /* boolean isSolution(){
            if( this.a != 0 ){
                if( this.getDiscriminant() >= 0 ){
                    return true;
                }else{
                    return false;
                }
            }else if( b == 0 && c != 0){
                return false;
            }else{
                return true;
            } */
        }
}

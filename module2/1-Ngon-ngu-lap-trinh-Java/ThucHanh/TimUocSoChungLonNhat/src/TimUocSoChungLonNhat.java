import java.util.Scanner;

public class TimUocSoChungLonNhat {
    public static void main(String[] args){
        int number1, number2;
        int uocChungLN;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a: ");
        number1 = scanner.nextInt();
        System.out.println("Nhập b: ");
        number2 = scanner.nextInt();
        int a = number1;
        int b = number2;
        while( a != b ){
            if( a > b){
                a -= b;
            }else{
                b -= a;
            }
        }
        uocChungLN = a;
        System.out.println("Ước chung lớn nhất của "+number1+" và "+number2+" là "+ uocChungLN);
        System.out.println("Ước chung lớn nhất của "+number1+" và "+number2+" là "+ (number1*number2)/uocChungLN);
    }
}

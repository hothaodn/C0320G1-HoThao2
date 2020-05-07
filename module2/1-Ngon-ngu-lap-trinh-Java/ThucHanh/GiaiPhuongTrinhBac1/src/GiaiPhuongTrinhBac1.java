import java.util.Scanner;

public class GiaiPhuongTrinhBac1 {
    public static void main(String[] args){
        //Viết chương trình LinearEquationResolver cho phép tìm ra nghiệm của một phương trình bậc nhất từ các hệ số do người dùng nhập vào.
        float a,b;
        System.out.println("Tìm nghiệm phương trình ax + b = 0");
        System.out.println("Nhập a: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextFloat();
        System.out.println("Nhập b: ");
        b = scanner.nextFloat();
        if( a == 0){
            System.out.println("Phương trình có vô số nghiệm");
        }
    }
}

import java.util.Scanner;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args){
        long number = 2;
        boolean check = true;
        int count = 1;
        int numberOfSoNguyenTo;
        System.out.println("Bạn muốn hiển thị bao nhiêu số nguyên tố đầu tiên trong dãy số? ");
        Scanner input = new Scanner(System.in);
        numberOfSoNguyenTo = input.nextInt();
        System.out.println(numberOfSoNguyenTo + " số nguyên tố đầu tiên trong dãy số là: ");
        while (count <= numberOfSoNguyenTo){
            if( number == 2 ){
                System.out.println(number);
                number++;
                count++;
            }else{
                for ( int i = 2; i <= Math.sqrt(number) ; i++){
                    if( number % i == 0 ){
                        check = false;
                        break;
                    }
                }
                if(check == true){
                    System.out.println(number);
                    count++;
                }
                check = true;
                number++;
            }
        }
    }
}

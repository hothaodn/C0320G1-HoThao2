import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args){
        int number;
        boolean check = true;
        System.out.println("Input number:");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        if ( number < 2 ){
            check = false;
        }else if ( number == 2 ){
            check = true;
        }else {
            for ( int i = 2; i <= Math.sqrt(number); i++){
                if ( number % i == 0){
                    check = false;
                    break;
                }
            }
        }
        if( check == true ){
            System.out.println(number + " là số nguyên tố");
        }else{
            System.out.println(number + " không là số nguyên tố");
        }
    }
}

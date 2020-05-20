import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args){
        /*Cách xác định năm nhuận: Những năm chia hết cho 4 là năm nhuận,
        ngoại trừ những năm chia hết cho 100 mà không chia hết cho 400.
        Từ đó, có thể rút gọn thành các quy tắc xác định năm nhuận:
        _Những năm chia hết cho 4 mà không chia hết cho 100 là năm nhuận
        _Những năm chia hết cho 100 mà không chia hết cho 400 thì KHÔNG PHẢI là năm nhuận
        Những năm chia hết đồng thời cho 100 và 400 là năm nhuận*/
        boolean check = false;
        short year;
        Scanner input = new Scanner(System.in);
        System.out.println("Input 1 year to check Leap year: ");
        year = input.nextShort();
        if( year % 4 == 0){
            if( year % 100 == 0){
                if( year % 400 == 0) {
                    check = true;
                }
            } else{
                check = true;
            }
        }
        if( check == true ){
            System.out.println( year + " is a leap year");
        }else{
            System.out.println( year + " is NOT a leap year");
        }
    }
}

import java.util.Scanner;

public class TinhSoNgayTrongThang {
    public static void main (String[] args){
        //Viết một chương trình tính số ngày trong tháng của một tháng cho trước.
        // Trong một năm, tháng 2 có thể có 28 hoặc 29 ngày, các tháng 1, 3, 5, 7, 8, 10, 12 có 31 ngày, các tháng còn lại có 30 ngày.
        int month, numOfDays;
        System.out.println("Which is the month?");
        Scanner scanner = new Scanner(System.in);
        month = scanner.nextInt();
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numOfDays = 31;
                break;
            case 4:
           case 6:
            case 9:
            case 11:
                numOfDays = 30;
            break;
            case 2:
                numOfDays = 28;
                break;
            default:
                numOfDays = 0;
        }
        if( numOfDays != 0){
            System.out.println("Số ngày của tháng " + month + " là " + numOfDays);
        } else{
            System.out.println("Số ngày của tháng " + month + " là " + numOfDays);
        }
    }
}

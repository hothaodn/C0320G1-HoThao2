import java.util.Scanner;

public class DemSoLanXuatHienKiTuTrongChuoi {
    public static void main(String[] arrg){
        //phát triển một cho phép đếm số lần xuất hiện của một ký tự được nhập vào từ bàn phím cho một chuỗi cho trước.
        String text = "";
        char char1;
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Input a text: ");
        text = input.nextLine();
        System.out.println("Which character do you wanna to search? ");
        char1 = input.nextLine().charAt(0);
        for ( int i = 0; i < text.length(); i++){
            if( text.charAt(i) == char1){
                count++;
            }
        }
        System.out.println(char1 + " appears " + count + " times");
    }
}

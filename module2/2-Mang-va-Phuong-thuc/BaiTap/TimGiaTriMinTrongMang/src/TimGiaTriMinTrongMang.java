import java.util.Scanner;

public class TimGiaTriMinTrongMang {
    /*phát triển một chương trình cho phép người dùng khai báo một mảng số nguyên
    với các giá trị trong mảng được khởi tạo sẵn hoặc được nhập từ bàn phím.
    Chương trình sẽ hiển thị ra giá trị nhỏ nhất trong mảng.*/
    public static void main(String[] args){
        int size;
        int min = 0;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("How many numbers? ");
            size = input.nextInt();
            if( size < 2 ){
                System.out.println("Minimum size is 2");
            }
        }while ( size < 2);

        int[] number = new int[size];
        System.out.println("Input data: ");
        for ( int i = 0; i < number.length; i++ ){
            System.out.println("Index "+i+": ");
            number[i] = input.nextInt();
            min = number[0];
            if(number[i] < min){
                min = number[i];
            }
        }
        System.out.println("Array: ");
        for ( int i = 0; i < number.length; i++ ){
            System.out.print(number[i] + "\t");
        }
        System.out.println("Min value of array: "+min);
    }
}

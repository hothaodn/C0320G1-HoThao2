import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args){
        /*phát triển một chương trình cho phép người dùng khai báo mảng mảng số nguyên gồm N phần tử.
        Nhập một giá trị bất kỳ từ bàn phím và vị trí cần chèn, giá trị này được chèn vào vị trí đó trong mảng.*/
        int size, index;
        Scanner input = new Scanner(System.in);
        System.out.println("How many elements do you want to add? ");
        size = input.nextInt();
        int[] arr = new int[size];
        for( int i = 0; i < arr.length; i++){
            System.out.println("Index " + i +": " );
            arr[i] = input.nextInt();
        }
        for( int i = 0; i < arr.length; i++){
            System.out.print( arr[i] + "["+i+"]\t");
        }
        System.out.println("\nWhich position do you wanna insert? ");
        index = input.nextInt();
        int temp = 0;
        if( index >= 1 && index < arr.length){
            System.out.println("Input new value: ");
            int newValue = input.nextInt();
            for( int i = index; i < arr.length-1; i++){
                //temp = arr[index];
                arr[i+1] = arr [i];
                arr[index] = newValue;
            }
            for( int i = 0; i < arr.length; i++){
                System.out.print( arr[i] + "["+i+"]\t");
            }
        }else{
            System.out.print("Exceed the size of array");
        }
    }
}

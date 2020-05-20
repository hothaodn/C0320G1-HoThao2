import java.util.Scanner;

public class DaoNguocCacPhanTuTrongMang {
    public static void main(String[] args){
        //Ứng dụng cho phép nhập vào lần lượt các phần tử của một mảng
        // (tối đa là 20 phần tử) và sau đó đảo ngược thứ tự của các phần tử.
        Scanner input = new Scanner(System.in);
        int size;
        do{
            System.out.println("How many numbers do you want to add? ");
            size = input.nextInt();
            if( size > 20){
                System.out.println("Maximum of quanlity is 20");
            }
        }while (size > 20);
        int[] arr = new int[size];
        System.out.println("Input value here: ");
        for( int i = 0; i < arr.length; i++){
            arr[i] = input.nextInt();
        }
        for( int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
        //reverse
        int temp = 0;
        for( int i = 0; i < arr.length/2; i++){
            temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        System.out.println("\nAfter reversing: ");
        for( int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
    }
}

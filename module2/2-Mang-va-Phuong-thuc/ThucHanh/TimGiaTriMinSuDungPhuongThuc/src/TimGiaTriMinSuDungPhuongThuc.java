import java.util.Scanner;

public class TimGiaTriMinSuDungPhuongThuc {
    public static void main(String[] args){
        int size;
        Scanner input = new Scanner(System.in);
        System.out.println("How many elements do you want to add? ");
        size = input.nextInt();
        int[] arr = new int[size];
        for( int i = 0; i < arr.length; i++){
            System.out.println("Index " + i +": " );
            arr[i] = input.nextInt();
        }
        for( int i = 0; i < arr.length; i++){
            System.out.print( arr[i] + "\t");
        }
        System.out.println("Min is: " + arr[minValue(arr)] + " at position " + minValue(arr));
    }
    public static int minValue(int[] arr1){
        int min = arr1[0];
        int index = 0;
        for( int i = 0; i < arr1.length; i++ ){
            if( arr1[i] < min){
                min = arr1[i];
                index = i;
            }
        }
        return index;
    }
}

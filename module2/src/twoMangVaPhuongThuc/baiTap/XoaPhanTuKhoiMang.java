import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args){
        int size;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("How many numbers? ");
            size = input.nextInt();
            if( size < 2 ){
                System.out.println("Minimum size is 2");
            }
        }while ( size < 2);
        int[] number = new int[size];
        for ( int i = 0; i < number.length; i++ ){
            number[i] = (int) (Math.random() * 10);
        }
        System.out.println(display(number));
        int newSize = size;
        do {
            System.out.println("Which number do you wanna remove from array? ");
            int numberDelete = input.nextInt();
            int count = 0;
            for (int i = 0; i < number.length; i++) {
                if (number[i] == numberDelete) {
                    count++;
                    for (int j = i + 1; j < number.length; j++) {
                        number[j - 1] = number[j];
                        number[j] = -1;
                    }
                    i--;
                }
            }

            newSize -= count;
            int[] newNumber = new int[newSize];

            for (int j = 0; j < newSize; j++) {
                newNumber[j] = number[j];
            }
            System.out.println(display(newNumber));
            //newSize = 0;
            //count = 0;
        }while (true);
    }
    public static String display(int[] arr){
        String print = "";
        for ( int i = 0; i < arr.length; i++ ){
            print += arr[i]+"\t";
        }
        return print;
    }
    //public static int[] initArr(int[] arr){
        //return arr;
    //}
}

import java.util.Scanner;

public class TinhTongCacSoOCotXacDinh {
    /*Viết một ứng dụng cho phép người dùng nhập vào một mảng hai chiều của các số thực,
    sau đó cho phép người dùng nhập vào thứ tự của một cột
    (tính từ 0) và tính ra tổng các phần tử của cột đó.*/
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int row, column, columnIndex;
        int sumOfColumn = 0;
        System.out.println("How many rows? ");
        row = input.nextInt();
        System.out.println("How many columns? ");
        column = input.nextInt();
        int[][] array = new int[row][column];
        //tính total cột
        System.out.println("Which number of column do you wanna take summary? ");
        columnIndex = input.nextInt();
        for( int i = 0; i < row; i++){
            array[i] = new int[column];
            for( int j = 0; j < column; j++){
                array[i][j] = (int) (Math.floor(Math.random() * 10));
                if( j == columnIndex ){
                    sumOfColumn += array[i][j];
                }
            }
        }
        System.out.println(display(array));
        System.out.println("Summary of column " + columnIndex + " is: " + sumOfColumn);
    }
    public static String display(int[][] arr){
        String print = "Array\n";
        for (int[] ints : arr) {
            for (int j = 0; j < ints.length; j++) {
                print += ints[j] + "\t";
            }
            print += "\n";
        }
        return print;
    }
}

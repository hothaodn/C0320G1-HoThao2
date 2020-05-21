import java.util.Scanner;

public class TimPhanTuLonNhatTrongMang2Chieu {
    public static void main(String[] args){
        //Viết một ứng dụng cho phép người dùng nhập vào một ma trận số thực,
        // sau đó tìm ra tọa độ cũng như giá trị của phần tử lớn nhất.
        int row, column;
        Scanner input = new Scanner(System.in);
        System.out.print("How many rows? ");
        row = input.nextInt();
        System.out.print("How many columns? ");
        column = input.nextInt();
        float[][] arr = new float[row][];
        float max = 0;
        int row1 = 0, column1 = 0;
        for ( int i = 0; i < row; i++){
            arr[i] = new float[column];
            for ( int j = 0; j < column; j++){
                System.out.print("Row " + i + " Column " + j + " : ");
                arr[i][j] = input.nextInt();
                max = arr[0][0];
                if( arr[i][j] > max){
                    max = arr[i][j];
                    row1 = i;
                    column1 = j;
                }
            }
        }
        for ( int i = 0; i < row; i++){
            for ( int j = 0; j < column; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.print("\n");
        }
        System.out.println("Max element is: " + max + " at row "+ row1 + " and column "+column1);
    }
}

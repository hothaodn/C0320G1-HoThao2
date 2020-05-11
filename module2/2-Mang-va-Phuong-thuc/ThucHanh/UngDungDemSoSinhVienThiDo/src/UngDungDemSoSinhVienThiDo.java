import java.util.Scanner;

public class UngDungDemSoSinhVienThiDo {
    public static void main(String[] args){
        //phát triển một chức năng cho phép đếm số lượng sinh viên đã thi đỗ một kỳ thi,
        // dựa vào danh sách điểm được nhập vào.
        int size;
        int count = 0;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("How many students do you wanna add the mark?  ");
            size = input.nextInt();
            if(size < 0){
                System.out.println("Must be larger than 0");
            }
        }while ( size < 0 );
        float[] marksList = new float[size];
        for ( int i = 0; i < size; i++){
            System.out.println("Student " + (i+1));
            float temp = input.nextFloat();
            if( temp >= 0 && temp <= 10){
                marksList[i] = temp;
                if( marksList[i] >= 5){
                    count++;
                }
            }else{
                System.out.println("Invalid mark");
            }
        }
        System.out.print("List: ");
        for ( int i = 0; i < size; i++){
            System.out.print(marksList[i] + "\n");
        }
        System.out.println("There are " + count + " students passed the exam");
    }
}

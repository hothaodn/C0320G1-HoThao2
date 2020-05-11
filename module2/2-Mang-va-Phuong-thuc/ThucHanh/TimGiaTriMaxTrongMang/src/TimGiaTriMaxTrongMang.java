import java.util.Scanner;

public class TimGiaTriMaxTrongMang {
    public static void main(String[] args){
        /*Ứng dụng cho phép người dùng lần lượt nhập vào giá trị tài sản của các tỷ phú thế giới (đơn vị tỉ đô),
        tối đa cho phép nhập 20 giá trị, sau đó hiển thị giá trị tài sản lớn nhất và vị trí của nó trong danh sách.*/
        int size;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("How many billionares do you want to compare? ");
            size = input.nextInt();
            if( size > 20){
                System.out.println("Maximum size is 20");
            }
        }while ( size > 20);
        double[] asset = new double[size];
        System.out.println("Input data: ");
        for ( int i = 0; i < asset.length; i++ ){
            asset[i] = input.nextDouble();
        }
        //System.out.println("Data: " + asset);
        for ( int i = 0; i < asset.length; i++ ){
            System.out.print(asset[i] + "\t");
        }

        double max = asset[0];
        int index = 0;
        for ( int i = 0; i < asset.length; i++ ){
            if( asset[i] > max){
                max = asset[i];
                index = i + 1;
            }
        }
        System.out.println("\nBiggest asset is: " +  max + " at position " + index);
    }
}

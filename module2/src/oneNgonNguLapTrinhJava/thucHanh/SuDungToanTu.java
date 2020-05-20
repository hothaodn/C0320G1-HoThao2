import java.util.Scanner;

public class SuDungToanTu {
    public static void main (String[] args){
        //Viết một ứng dụng để tính diện tích của hình chữ nhật dựa vào chiều rộng và chiều cao được nhập vào.
        float width;
        float height;
        Scanner sc = new Scanner(System.in);
        System.out.println("Give width: ");
        width = sc.nextFloat();
        System.out.println("Give height: ");
        height = sc.nextFloat();
        float rectArea = width * height;
        System.out.println("Area of the rectangle is " + rectArea);
    }
}

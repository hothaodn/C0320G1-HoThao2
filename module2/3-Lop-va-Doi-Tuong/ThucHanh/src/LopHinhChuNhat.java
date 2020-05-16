import java.util.Scanner;

public class LopHinhChuNhat {
    /*phát triển một ứng dụng để tính diện tích và chu vi của hình chữ nhật.
    Ứng dụng cũng cho phép hiển thị hình chữ nhật. Ứng dụng được thiết kế theo mô hình Hướng Đối tượng.
    Lớp Hình chữ nhật có các thuộc tính: width (chiều rộng), height (chiều cao),
    phương thức khởi tạo không tham số và có 2 tham số, các phương thức:
    getArea() (tính diện tích), getPerimeter() (tính chu vi) và display() (hiển thị).*/
    public static void main(String[] args) {
        float height, width;
        Scanner input = new Scanner(System.in);
        System.out.println("Input height: ");
        height = input.nextFloat();
        System.out.println("Input width: ");
        width = input.nextFloat();
        Rectangle hinhChuNhat = new Rectangle(height,width);
        System.out.println("Perimeter: " + hinhChuNhat.getPerimeter());
        System.out.println("Area: " + hinhChuNhat.getArea());
    }
    public static class Rectangle{
        float height, width;
        Rectangle(){
        }
        Rectangle(float height, float weight){
            this.height = height;
            this.width = weight;
        }
        private float getPerimeter(){
            return (this.height + this.width)*2;
        }
        private float getArea(){
            return this.height * this.width;
        }
    }
}

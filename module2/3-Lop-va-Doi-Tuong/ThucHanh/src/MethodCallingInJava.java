package vidu;

public class MethodCallingInJava {
    // tạo 1 phương thức có kiểu trả về là void và không có tham số truyền vào
    // để gọi phương thức này trong main() thì phải khai báo là static
    public static void nhap() {
        System.out.println("Đây là ví dụ minh họa cách gọi phương thức void không đối trong Java");
    }

    // tạo 1 phương thức có kiểu trả về là void và có tham số truyền vào
    public static void nhapCoDoiSo(String str) {
        System.out.println(str);
    }

    // tạo 1 phương thức có kiểu trả về là int và có 2 tham số truyền vào có kiểu int
    public static int tinhTong(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        nhap(); // gọi phương thức nhap()
        nhapCoDoiSo("Đây là ví dụ minh họa cách gọi phương thức void có đối số trong Java");

        System.out.println("\nĐây là ví dụ minh họa cách gọi phương thức có kiểu trả về"
                + " là int và có tham số truyền vào trong Java");
        int c = tinhTong(3, 5); // c = a + b
        System.out.println("c = " + c);
    }

}
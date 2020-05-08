import java.util.Scanner;

public class HienThiLoiChao {
    public static void main(String[] args){
        //Trong phần này, chúng ta sẽ phát triển một ứng dụng Java cho phép nhập tên của người dùng từ bàn phím,
        // sau đó hiển thị lời chào kèm theo tên của người đó.
        String name;
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        System.out.println("Hello " + name);
    }
}

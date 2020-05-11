import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args){
        /*phát triển một ứng dụng hiển thị một menu cho phép người dùng lựa chọn hiển thị các hình. Menu gồm các lựa chọn như sau
        Menu:
        Print the rectangle
        Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)
        Print isosceles triangle
        Exit*/
        int number;
        String temp = "";
        System.out.println("MENU:\n1-Print the rectangle\n2-Print the square triangle\n3-Print isosceles triangle\n4-Exit");
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.println("Choose the number: ");
            number = input.nextInt();
            switch (number) {
                case 1:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 8; j++) {
                            temp += " * ";
                        }
                        temp += "\n";
                    }
                    System.out.println(temp);
                    temp = "";
                    break;
                case 2:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 1 + i; j++) {
                            temp += " * ";
                        }
                        temp += "\n";
                    }
                    System.out.println(temp);
                    temp = "";
                    break;
                case 3:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5 - i; j++) {
                            temp += " * ";
                        }
                        temp += "\n";
                    }
                    System.out.println(temp);
                    temp = "";
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Incorrect number");
                    break;
            }
        }
    }
}

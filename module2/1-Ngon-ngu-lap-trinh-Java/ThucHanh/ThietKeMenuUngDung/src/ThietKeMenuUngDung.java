import java.util.Scanner;

public class ThietKeMenuUngDung {
    public static void main(String[] args){
        System.out.println("MENU\n1. Draw Rectangle\n2. Draw Square\n3. Draw Triangle\n4. Exit");
        byte number;
        System.out.println("Choose the number:  ");
        Scanner input = new Scanner(System.in);
        while (true){
            number = input.nextByte();
            switch (number){
                case 1:
                    for ( int i = 1; i <= 3; i++){
                        for ( int j = 1; j <= 10; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    for ( int i = 1; i <= 5; i++){
                        for ( int j = 1; j <= 5; j++) {
                            System.out.print(" * ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 3:
                    for ( int i = 0; i <= 5; i++){
                        for ( int j = 1; j <= (5 - i); j++){
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.print("Please choose the correct number: ");
                    break;
            }
        }
    }
}

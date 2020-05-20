import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args){
        double currency1;
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Currency Convert\n1- USD >>> VND\n2- VND >>> USD\n3- Exit");

        while (true){
            System.out.println("Choose menu number: ");
            number = input.nextInt();
            System.out.println("Amount: ");
            currency1 = input.nextDouble();
            double currency2;
            switch (number){
                case 1:
                    currency2 = currency1 * 23000;
                    System.out.println(currency1 + " USD = " + currency2 + " VND");
                    break;
                case 2:
                    currency2 = currency1 / 23000;
                    System.out.println(currency1 + " VND = " + currency2 + " USD");
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Incorrect number");
                    break;
            }
        }
    }
}

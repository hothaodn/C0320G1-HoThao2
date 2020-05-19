package controllers;

import java.util.Scanner;

public class MainController {

    public static void displayMainMenu(){
        System.out.println("MENU\n" +
                "1.\tAdd New Services\n" +
                "2.\tShow Services\n" +
                "3.\tAdd New Customer\n" +
                "4.\tShow Information of Customer\n" +
                "5.\tAdd New Booking\n" +
                "6.\tShow Information of Employee\n" +
                "7.\tExit\n");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        switch (number){
            case 1:
                addNewServies();
                break;
            case 2:
                showServices();
                break;
            case 7:
                System.exit(0);
                break;
            default:
                System.out.println("Please choose the number of menu");
        }
    }
    public static void addNewServies(){
        System.out.println("ADD NEW SERVICE:\n" +
                "1.\tAdd New Villa\n" +
                "2.\tAdd New House\n" +
                "3.\tAdd New Room\n" +
                "4.\tBack to menu\n" +
                "5.\tExit\n");
    }
3
    public static void showServices(){
        System.out.println("SHOW SERVICES:\n" +
                "1.\tShow all Villa\n" +
                "2.\tShow all House\n" +
                "3.\tShow all Room\n" +
                "4.\tShow All Name Villa Not Duplicate\n" +
                "5.\tShow All Name House Not Duplicate\n" +
                "6.\tShow All Name Name Not Duplicate\n" +
                "7.\tBack to menu\n" +
                "8.\tExit\n");
    }
}

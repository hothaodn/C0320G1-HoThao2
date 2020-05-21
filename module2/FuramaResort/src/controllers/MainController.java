package controllers;

import service.*;
import service.impl.*;
import commons.*;

import java.util.Scanner;

public class MainController {
    public static void processMain(){
        try{
            Menu.displayMainMenu();
            processMainMenu();
        }catch (Exception e){
            //getBackMainMenu();
            processMain();
            System.out.println("Error");
        }
    }

    //static void getBackMainMenu() {
        //Menu.displayMainMenu();
        //processMain();
    //}

    public static void processMainMenu(){
        Scanner input = new Scanner(System.in);
        switch (input.nextLine()){
            case "1":
                Menu.menuAddNewServices();
                ServiceController.processMenuAddNewServices();
                break;
            case "2":

                break;
            case "3":
                CustomerController.addNewCustomers();
                break;
            case "4":
                CustomerController.showCustomersInfo();
                break;
            case "5":
                BookingController.addnewBooking();
                break;
            case "6":
                EmployeesController.showEmployeesInfo();
                break;
            case "7":
                System.exit(0);
                break;
            default:
                System.out.println("Fail. Please choose number of menu exactly !");
                processMain();
                break;
        }
    }
}

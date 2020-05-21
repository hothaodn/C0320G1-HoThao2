package controllers;

import models.*;
import service.*;
import service.impl.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainController {
    private ServiceInterface villaService = new VillaServiceImpl();
    private ServiceInterface houseService = new HouseServiceImpl();
    private ServiceInterface roomService = new RoomServiceImpl();

    public void displayMainMenu(){
        System.out.println("MENU\n" +
                "1.\tAdd New Services\n" +
                "2.\tShow Services\n" +
                "3.\tAdd New Customer\n" +
                "4.\tShow Information of Customer\n" +
                "5.\tAdd New Booking\n" +
                "6.\tShow Information of Employee\n" +
                "7.\tExit\n");
        Scanner input = new Scanner(System.in);
        String number = input.nextLine();
        switch (number){
            case "1":
                this.menuAddNewServies();
                break;
            case "2":
                showServices();
                break;
            case "4":
                //displayMainMenu();
                break;
            case "7":
                System.exit(0);
                break;
            default:
                System.out.println("Fail. Please choose number of menu exactly. Enter to continue...");
                number = input.nextLine();
                displayMainMenu();
                break;
        }
    }

    public void menuAddNewServies(){
        System.out.println("ADD NEW SERVICE:\n" +
                "1.\tAdd New Villa\n" +
                "2.\tAdd New House\n" +
                "3.\tAdd New Room\n" +
                "4.\tBack to menu\n" +
                "5.\tExit\n");
        Scanner input = new Scanner(System.in);
        String number = input.nextLine();
        switch (number){
            case "1":
                this.addVillaService();
                break;
            case "2":
                this.addHouseService();
                break;
            case "3":
                this.addRoomService();
                break;
            case "4":
                displayMainMenu();
                break;
            case "5":
                System.exit(0);
                break;
            default:
                System.out.println("Fail. Please choose number of menu exactly. Enter to continue...");
                number = input.nextLine();
                menuAddNewServies();
                break;
        }
    }

    public void addVillaService(){
        Scanner input = new Scanner(System.in);
        System.out.println("How many villa services do you want to add? ");
        int length = Integer.parseInt(input.nextLine());
        ArrayList<Villa> villaList = new ArrayList<Villa>(length);

        for ( int i = 0; i < length; i++){
            Villa villa = (Villa) villaService.addNewService();
            villaList.add(villa);
        }
        FuncRecordAndReadFileCSV.recordFileCSV(villaList);
        menuAddNewServies();
    }

    public void addHouseService(){
        Scanner input = new Scanner(System.in);
        System.out.println("How many house services do you want to add? ");
        int length = Integer.parseInt(input.nextLine());
        ArrayList<House> houseList = new ArrayList<House>(length);

        for ( int i = 0; i < length; i++){
            House house = (House) houseService.addNewService();
            houseList.add(house);
        }
        menuAddNewServies();
    }

    public void addRoomService(){
        Scanner input = new Scanner(System.in);
        System.out.println("How many rooms services do you want to add? ");
        int length = Integer.parseInt(input.nextLine());
        ArrayList<Room> roomList = new ArrayList<Room>(length);

        for ( int i = 0; i < length; i++){
            Room room = (Room) roomService.addNewService();
            roomList.add(room);
        }
        menuAddNewServies();
    }
    //============================ TASK 3 ============================
    public void showServices(){
        //public static void menuShowServices(){
        System.out.println("SHOW SERVICES:\n" +
                    "1.\tShow all Villa\n" +
                    "2.\tShow all House\n" +
                    "3.\tShow all Room\n" +
                    "4.\tShow All Name Villa Not Duplicate\n" +
                    "5.\tShow All Name House Not Duplicate\n" +
                    "6.\tShow All Name Name Not Duplicate\n" +
                    "7.\tBack to menu\n" +
                    "8.\tExit\n");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        switch (number){
            case 1:
                //for (Villa element : ){
                    //System.out.println(element.showInfor());
                //}
                displayMainMenu();
                break;
            case 2:
                //for (House element : ){
                    //System.out.println(element.showInfor());
                //}
                displayMainMenu();
                break;
            case 3:
                //for (Room element : ){
                    //System.out.println(element.showInfor());
                //}
                displayMainMenu();
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                displayMainMenu();
                break;
            case 8:
                System.exit(0);
                break;
            default:
                System.out.println("Please choose the number of menu");
        }
    }
}

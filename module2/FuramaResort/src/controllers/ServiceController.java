package controllers;

import commons.Menu;
import models.*;
import service.ServiceInterface;
import service.impl.*;
import controllers.*;
import sun.applet.Main;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceController {
    private static ServiceInterface villaService = new VillaServiceImpl();
    private static ServiceInterface houseService = new HouseServiceImpl();
    private static ServiceInterface roomService = new RoomServiceImpl();

    public static void processMenuAddNewServices(){
        Scanner input = new Scanner(System.in);
        //String number = input.nextLine();
        switch (input.nextLine()){
            case "1":
                addVillaService();
                break;
            case "2":
                addHouseService();
                break;
            case "3":

                break;
            case "4":
                MainController.processMain();
                break;
            case "5":
                System.exit(0);
                break;
            default:
                System.out.println("Fail. Please choose number of menu exactly. Enter to continue...");
                MainController.processMain();
                break;
        }
    }

    public static void addVillaService(){
        Scanner input = new Scanner(System.in);
        System.out.println("How many villa services do you want to add? ");
        int length = Integer.parseInt(input.nextLine());
        ArrayList<Villa> villaList = new ArrayList<Villa>(length);

        for ( int i = 0; i < length; i++){
            Villa villa = (Villa) villaService.addNewService();
            villaList.add(villa);
        }
        FuncRecordAndReadFileCSV.recordFileCSV(villaList);
        MainController.processMain();
    }

    public static void addHouseService(){
        Scanner input = new Scanner(System.in);
        System.out.println("How many house services do you want to add? ");
        int length = Integer.parseInt(input.nextLine());
        ArrayList<House> houseList = new ArrayList<House>(length);

        for ( int i = 0; i < length; i++){
            House house = (House) houseService.addNewService();
            houseList.add(house);
        }
        MainController.processMain();
    }

    public static void addRoomService(){
        Scanner input = new Scanner(System.in);
        System.out.println("How many rooms services do you want to add? ");
        int length = Integer.parseInt(input.nextLine());
        ArrayList<Room> roomList = new ArrayList<Room>(length);

        for ( int i = 0; i < length; i++){
            Room room = (Room) roomService.addNewService();
            roomList.add(room);
        }
        MainController.processMain();
    }
}

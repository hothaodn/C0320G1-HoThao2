package controllers;

import models.*;
import service.ServiceInterface;
import service.impl.*;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceController {
    private static ServiceInterface villaService = new VillaServiceImpl();
    private static ServiceInterface houseService = new HouseServiceImpl();
    private static ServiceInterface roomService = new RoomServiceImpl();

    //=============================== ADD NEW SERVICE ===============================
    public static void addVillaService(){
        Scanner input = new Scanner(System.in);
        System.out.println("How many villa services do you want to add? ");
        int length = Integer.parseInt(input.nextLine());
        ArrayList<Villa> villaList = FuncReadServicesFileCSV.getFileCSVVilla();
        for ( int i = 0; i < length; i++){
            Villa villa = (Villa) villaService.addNewService();
            villaList.add(villa);
        }
        FuncRecordServicesFileCSV.recordFileCSVVilla(villaList);
        MainController.processMain();
    }

    public static void addHouseService(){
        Scanner input = new Scanner(System.in);
        System.out.println("How many houses services do you want to add? ");
        int length = Integer.parseInt(input.nextLine());
        ArrayList<House> houseList = FuncReadServicesFileCSV.getFileCSVHouse();

        for ( int i = 0; i < length; i++){
            House house = (House) houseService.addNewService();
            houseList.add(house);
        }
        FuncRecordServicesFileCSV.recordFileCSVHouse(houseList);
        MainController.processMain();
    }

    public static void addRoomService(){
        Scanner input = new Scanner(System.in);
        System.out.println("How many rooms services do you want to add? ");
        int length = Integer.parseInt(input.nextLine());
        ArrayList<Room> roomList = FuncReadServicesFileCSV.getFileCSVRoom();

        for ( int i = 0; i < length; i++){
            Room room = (Room) roomService.addNewService();
            roomList.add(room);
        }
        FuncRecordServicesFileCSV.recordFileCSVRoom(roomList);
        MainController.processMain();
    }
    //=============================== SHOW SERVICE ===============================
    public static void showAllVillaServices(){
        ArrayList<Villa> list = FuncReadServicesFileCSV.getFileCSVVilla();
        for(Villa element : list){
            System.out.println(element.showInfor());
        }
    }

    public static void showAllHouseServices(){
        ArrayList<House> list = FuncReadServicesFileCSV.getFileCSVHouse();
        for(House element : list){
            System.out.println(element.showInfor());
        }
    }

    public static void showAllRoomServices(){
        ArrayList<Room> list = FuncReadServicesFileCSV.getFileCSVRoom();
        for(Room element : list){
            System.out.println(element.showInfor());
        }
    }
}

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
        System.out.println(">>>>>>>>>>>>>>>> How many villa services do you want to add? ");
        int length = Integer.parseInt(input.nextLine());
        ArrayList<Villa> villaList = FuncReadServicesFileCSV.readFileCSVVilla();
        for ( int i = 0; i < length; i++){
            Villa villa = (Villa) villaService.addNewService();
            villaList.add(villa);
        }
        FuncWriteServicesFileCSV.writeFileCSVVilla(villaList);
        MainController.processMain();
    }

    public static void addHouseService(){
        Scanner input = new Scanner(System.in);
        System.out.println(">>>>>>>>>>>>>>>> How many houses services do you want to add? ");
        int length = Integer.parseInt(input.nextLine());
        ArrayList<House> houseList = FuncReadServicesFileCSV.readFileCSVHouse();

        for ( int i = 0; i < length; i++){
            House house = (House) houseService.addNewService();
            houseList.add(house);
        }
        FuncWriteServicesFileCSV.writeFileCSVHouse(houseList);
        MainController.processMain();
    }

    public static void addRoomService(){
        Scanner input = new Scanner(System.in);
        System.out.println(">>>>>>>>>>>>>>>> How many rooms services do you want to add? ");
        int length = Integer.parseInt(input.nextLine());
        ArrayList<Room> roomList = FuncReadServicesFileCSV.readFileCSVRoom();

        for ( int i = 0; i < length; i++){
            Room room = (Room) roomService.addNewService();
            roomList.add(room);
        }
        FuncWriteServicesFileCSV.writeFileCSVRoom(roomList);
        MainController.processMain();
    }
    //=============================== SHOW SERVICE ===============================
    public static void showAllVillaServices(){
        ArrayList<Villa> list = FuncReadServicesFileCSV.readFileCSVVilla();
        for(Villa element : list){
            System.out.println(element.showInfor());
        }
    }

    public static void showAllHouseServices(){
        ArrayList<House> list = FuncReadServicesFileCSV.readFileCSVHouse();
        for(House element : list){
            System.out.println(element.showInfor());
        }
    }

    public static void showAllRoomServices(){
        ArrayList<Room> list = FuncReadServicesFileCSV.readFileCSVRoom();
        for(Room element : list){
            System.out.println(element.showInfor());
        }
    }
}

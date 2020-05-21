package service.impl;

import models.Services;
import models.Room;
import service.ServiceInterface;
import java.util.Scanner;

public class RoomServiceImpl implements ServiceInterface {
    @Override
    public Services addNewService() {
        Scanner input = new Scanner(System.in);
        Services room = new Room();

        System.out.println("ID: ");
        room.setId(input.nextLine());

        System.out.println("Service Name: ");
        room.setServiceName(input.nextLine());

        System.out.println("Area of Use ");
        room.setAreaUsing(Float.parseFloat(input.nextLine()));

        System.out.println("Rental Fee ");
        room.setrentalFee(Double.parseDouble(input.nextLine()));

        System.out.println("Max Occupancy: ");
        room.setmaxOccupancy(Integer.parseInt(input.nextLine()));

        System.out.println("Type of Rent: ");
        room.setTypeRental(input.nextLine());

        System.out.println("Display: ");
        System.out.println(room.showInfor());

        System.out.println("Complimentary of Room: ");
        ((Room) room).setComplimentary(input.nextLine());

        return room;
    }
}

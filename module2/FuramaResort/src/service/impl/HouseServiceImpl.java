package service.impl;

import models.Services;
import models.House;
import service.ServiceInterface;
import java.util.Scanner;

public class HouseServiceImpl implements ServiceInterface {
    @Override
    public Services addNewService() {
        Scanner input = new Scanner(System.in);
        Services house = new House();

        System.out.println("ID: ");
        house.setId(input.nextLine());

        System.out.println("Service Name: ");
        house.setServiceName(input.nextLine());

        System.out.println("Area of Use ");
        house.setAreaUsing(Float.parseFloat(input.nextLine()));

        System.out.println("Rental Fee ");
        house.setrentalFee(Double.parseDouble(input.nextLine()));

        System.out.println("Max Occupancy: ");
        house.setmaxOccupancy(Integer.parseInt(input.nextLine()));

        System.out.println("Type of Rent: ");
        house.setTypeRental(input.nextLine());

        System.out.println("Display: ");
        System.out.println(house.showInfor());;

        System.out.println("Standard of Room: ");
        ((House) house).setRoomStandard(input.nextLine());

        System.out.println("Facilites: ");
        ((House) house).setFacilites(input.nextLine());

        System.out.println("Number Of Floor: ");
        ((House) house).setnumberOfFloor(Integer.parseInt(input.nextLine()));

        return house;
    }
}

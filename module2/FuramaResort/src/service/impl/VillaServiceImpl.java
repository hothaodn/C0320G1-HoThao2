package service.impl;

import models.*;
import service.ServiceInterface;
import java.util.Scanner;

public class VillaServiceImpl implements ServiceInterface {
    @Override
    public Services addNewService() {
        Scanner input = new Scanner(System.in);
        Services villa = new Villa();

        System.out.println("ID: ");
        villa.setId(input.nextLine());

        System.out.println("Service Name: ");
        villa.setServiceName(input.nextLine());

        System.out.println("Area of Use ");
        villa.setAreaUsing(Float.parseFloat(input.nextLine()));

        System.out.println("Rental Fee ");
        villa.setrentalFee(Double.parseDouble(input.nextLine()));

        System.out.println("Max Occupancy: ");
        villa.setmaxOccupancy(Integer.parseInt(input.nextLine()));

        System.out.println("Type of Rent: ");
        villa.setTypeRental(input.nextLine());

        //System.out.println("Display: ");
        //villa.showInfor();

        System.out.println("Standard of Room: ");
        ((Villa) villa).setRoomStandard(input.nextLine());

        System.out.println("Facilites: ");
        ((Villa) villa).setFacilites(input.nextLine());

        System.out.println("Area of SwimmingPool: ");
        ((Villa) villa).setAreaSwimmingPool(input.nextLine());

        System.out.println("Number Of Floor: ");
        ((Villa) villa).setnumberOfFloor(Integer.parseInt(input.nextLine()));

    return villa;
    }
}

package service.impl;

import models.Services;
import models.Room;
import service.ServiceInterface;
import java.util.Scanner;

public class RoomServiceImpl extends CommonServiceImpl implements ServiceInterface {
    @Override
    public Services addNewService() {
        Scanner input = new Scanner(System.in);
        Services room = new Room();

        super.addCommonServiceInfo(room);

        System.out.println("Complimentary of Room: ");
        ((Room) room).setComplimentary(input.nextLine());

        return room;
    }
}

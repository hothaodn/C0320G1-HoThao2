package models;

import service.impl.VillaServiceImpl;

public class TempTest {
    public static void main(String[] args) {
        Services villa = new Villa();
        Services house = new House();
        Services room = new Room();

        System.out.println(villa.showInfor());
        System.out.println(house.showInfor());
        System.out.println(room.showInfor());

        System.out.println(villa);

        VillaServiceImpl villaService = new VillaServiceImpl();
        System.out.println(villaService.addNewService());
    }
}
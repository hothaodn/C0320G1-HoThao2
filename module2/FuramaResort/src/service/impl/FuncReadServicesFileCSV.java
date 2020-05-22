package service.impl;

import models.House;
import models.Room;
import models.Villa;

import java.io.*;
import java.util.ArrayList;

public class FuncReadServicesFileCSV {
    public static ArrayList<Villa> getFileCSVVilla() {
        BufferedReader br = null;
        ArrayList<Villa> list = new ArrayList<Villa>();
        try {
            br = new BufferedReader(new FileReader(FuncRecordServicesFileCSV.FILE_PATH_VILLA));
            String line = "";
            while (line != null) {
                line = br.readLine();
                String[] splitData = line.split(FuncRecordServicesFileCSV.COMMA_DELIMITER);
                if (splitData[0].equals("id")) {
                    continue;
                }
                Villa svc = new Villa();
                svc.setId(splitData[0]);
                svc.setServiceName(splitData[1]);
                svc.setAreaUsing(Float.parseFloat(splitData[2]));
                svc.setrentalFee(Double.parseDouble(splitData[3]));
                svc.setmaxOccupancy(Integer.parseInt(splitData[4]));
                svc.setTypeRental(splitData[5]);
                svc.setRoomStandard(splitData[6]);
                svc.setFacilites(splitData[7]);
                svc.setAreaSwimmingPool(splitData[8]);
                svc.setnumberOfFloor(Integer.parseInt(splitData[9]));
                list.add(svc);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return list;
    }

    public static ArrayList<House> getFileCSVHouse() {
        BufferedReader br = null;
        ArrayList<House> list = new ArrayList<House>();
        try {
            br = new BufferedReader(new FileReader(FuncRecordServicesFileCSV.FILE_PATH_HOUSE));
            String line = "";
            while (line != null) {
                line = br.readLine();
                String[] splitData = line.split(FuncRecordServicesFileCSV.COMMA_DELIMITER);
                if (splitData[0].equals("id")) {
                    continue;
                }
                House svc = new House();
                svc.setId(splitData[0]);
                svc.setServiceName(splitData[1]);
                svc.setAreaUsing(Float.parseFloat(splitData[2]));
                svc.setrentalFee(Double.parseDouble(splitData[3]));
                svc.setmaxOccupancy(Integer.parseInt(splitData[4]));
                svc.setTypeRental(splitData[5]);
                svc.setRoomStandard(splitData[6]);
                svc.setFacilites(splitData[7]);
                svc.setnumberOfFloor(Integer.parseInt(splitData[8]));
                list.add(svc);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return list;
    }

    public static ArrayList<Room> getFileCSVRoom() {
        BufferedReader br = null;
        ArrayList<Room> list = new ArrayList<Room>();
        try {
            br = new BufferedReader(new FileReader(FuncRecordServicesFileCSV.FILE_PATH_ROOM));
            String line = "";
            while (line != null) {
                line = br.readLine();
                String[] splitData = line.split(FuncRecordServicesFileCSV.COMMA_DELIMITER);
                if (splitData[0].equals("id")) {
                    continue;
                }
                Room svc = new Room();
                svc.setId(splitData[0]);
                svc.setServiceName(splitData[1]);
                svc.setAreaUsing(Float.parseFloat(splitData[2]));
                svc.setrentalFee(Double.parseDouble(splitData[3]));
                svc.setmaxOccupancy(Integer.parseInt(splitData[4]));
                svc.setTypeRental(splitData[5]);
                svc.setComplimentary(splitData[6]);
                list.add(svc);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return list;
    }
}

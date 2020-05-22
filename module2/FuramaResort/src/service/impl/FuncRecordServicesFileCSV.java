package service.impl;

import models.*;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FuncRecordServicesFileCSV {
    static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String FILE_HEADER_VILLA = "id,service name,area use, rental fee, max occ" +
            "type of rent, room's standard, facilities, swimming pool, number of floor";
    private static final String FILE_HEADER_HOUSE = "id,service name,area use, rental fee, max occ" +
            "type of rent, room's standard, facilities, number of floor";
    private static final String FILE_HEADER_ROOM = "id,service name,area use, rental fee, max occ" +
            "type of rent, complimentary";
    static final String FILE_PATH_VILLA = "src/data/villas.csv";
    static final String FILE_PATH_HOUSE = "src/data/houses.csv";
    static final String FILE_PATH_ROOM = "src/data/rooms.csv";

    public static void recordFileCSVVilla(ArrayList<Villa> villaList){
        FileWriter fileWriter = null;
        try{
            fileWriter = new FileWriter(FILE_PATH_VILLA, true);
            fileWriter.append(FILE_HEADER_VILLA);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for(Villa element : villaList){
                fileWriter.append(element.getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(element.getServiceName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(element.getAreaUsing()) );
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(element.getrentalFee()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(element.getmaxOccupancy()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(element.getTypeRental());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(element.getRoomStandard());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(element.getFacilites());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(element.getAreaSwimmingPool());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(element.getnumberOfFloor()));
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
            System.out.println("Saved successfully!");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Error in CSV File Record");
        } finally {
            try{
                fileWriter.flush();
                fileWriter.close();
            }catch (Exception ex){
                ex.printStackTrace();
                System.out.println("Error while flushing or closing");
            }
        }
    }

    public static void recordFileCSVHouse(ArrayList<House> houseList){
        FileWriter fileWriter = null;
        try{
            fileWriter = new FileWriter(FILE_PATH_HOUSE,true);
            fileWriter.append(FILE_HEADER_HOUSE);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for(House element : houseList){
                fileWriter.append(element.getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(element.getServiceName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(element.getAreaUsing()) );
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(element.getrentalFee()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(element.getmaxOccupancy()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(element.getTypeRental());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(element.getRoomStandard());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(element.getFacilites());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(element.getnumberOfFloor()));
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
            System.out.println("Saved successfully!");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Error in CSV File Record");
        } finally {
            try{
                fileWriter.flush();
                fileWriter.close();
            }catch (Exception ex){
                ex.printStackTrace();
                System.out.println("Error while flushing or closing");
            }
        }
    }

    public static void recordFileCSVRoom(ArrayList<Room> roomList){
        FileWriter fileWriter = null;
        try{
            fileWriter = new FileWriter(FILE_PATH_ROOM,true);
            fileWriter.append(FILE_HEADER_ROOM);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for(Room element : roomList){
                fileWriter.append(element.getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(element.getServiceName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(element.getAreaUsing()) );
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(element.getrentalFee()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(element.getmaxOccupancy()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(element.getTypeRental());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(element.getComplimentary());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
            System.out.println("Saved successfully!");
        }catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }

        }
    }
}

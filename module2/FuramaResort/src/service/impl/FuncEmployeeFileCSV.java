package service.impl;

import models.Customer;
import models.Employee;

import java.io.FileWriter;
import java.util.List;

public class FuncEmployeeFileCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String FILE_HEADER_CUSTOMER = "Name,Birthday,Gender,ID Card,Phone Number,Email,Type of Customer,Address,";
    static final String FILE_PATH_EMPLOYEE = "src/data/employee.csv";

    public static void writeFileCSV(List<Employee> list){
        FileWriter fileWriter = null;
        try{
            fileWriter = new FileWriter(FILE_PATH_EMPLOYEE);
            fileWriter.append(FILE_HEADER_CUSTOMER);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for(Employee element : list){
                fileWriter.append(element.getName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(element.getBirthday());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(element.getIdCard());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(element.getPhoneNumber());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(element.getEmail());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(element.getEducationLevel());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(element.getPosition());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(element.getSalary()));
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
}

package controllers;

import models.Customer;
import models.Employee;
import service.impl.FuncEmployeeFileCSV;

import java.io.FileWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeController {
    public static void showEmployeesInfo(){
        List<Employee> employeeList = FuncEmployeeFileCSV.readFileCSV();
//        System.out.println(employeeList);
        Map<String,Employee> map = new HashMap<>();
        for(Employee element : employeeList){
            map.put(element.getId(),element);
        }
        for( Map.Entry m : map.entrySet()){
            System.out.println("***********\nKey: "+ m.getKey() +"\nValue: "+m.getValue().toString());
        }
        MainController.processMain();
    }
}

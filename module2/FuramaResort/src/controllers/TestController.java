package controllers;

import models.Employee;
import service.impl.FuncEmployeeFileCSV;

import java.util.ArrayList;
import java.util.List;

public class TestController {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Lana","Sep 04","123456789","0935 666 666","lana@gmail,com","Uni","Sales",1000));
        employeeList.add(new Employee("Gaga","Jan 23","123456789","0935 666 666","gaga@gmail,com","Uni","Sales",1000));
        employeeList.add(new Employee("Rose","Sep 04","123456789","0935 666 666","rose@gmail,com","Uni","Sales",1000));
        employeeList.add(new Employee("Taylor","Sep 04","123456789","0935 666 666","taylor@gmail,com","Uni","Sales",1000));
        employeeList.add(new Employee("Miley","Sep 04","123456789","0935 666 666","miley@gmail,com","Uni","Sales",1000));
        employeeList.add(new Employee("Avril","Sep 04","123456789","0935 666 666","hothaodn@gmail,com","Uni","Sales",1000));
        employeeList.add(new Employee("Adele","Sep 04","123456789","0935 666 666","hothaodn@gmail,com","Uni","Sales",1000));
        employeeList.add(new Employee("Katy","Sep 04","123456789","0935 666 666","hothaodn@gmail,com","Uni","Sales",1000));
        employeeList.add(new Employee("Kesha","Sep 04","123456789","0935 666 666","hothaodn@gmail,com","Uni","Sales",1000));
        employeeList.add(new Employee("Rosie","Sep 04","123456789","0935 666 666","hothaodn@gmail,com","Uni","Sales",1000));
//        System.out.println(employeeList);
        FuncEmployeeFileCSV.writeFileCSV(employeeList);

        MainController.processMain();
    }
}

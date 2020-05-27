package controllers;

import models.Employee;
import service.impl.FuncEmployeeFileCSV;

import java.util.ArrayList;
import java.util.List;

public class TestController {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("001","Lana","Sep 04","123456789","0935 666 666","lana@gmail.com","Uni","Sales",1000));
        employeeList.add(new Employee("002","Gaga","Jan 23","123456789","0935 666 666","gaga@gmail.com","Uni","Sales",1000));
        employeeList.add(new Employee("003","Rose","Sep 04","123456789","0935 666 666","rose@gmail.com","Uni","Sales",1000));
        employeeList.add(new Employee("004","Taylor","Sep 04","123456789","0935 666 666","taylor@gmail.com","Uni","Sales",1000));
        employeeList.add(new Employee("005","Miley","Sep 04","123456789","0935 666 666","miley@gmail.com","Uni","Sales",1000));
        employeeList.add(new Employee("006","Avril","Sep 04","123456789","0935 666 666","hothaodn@gmail.com","Uni","Sales",1000));
        employeeList.add(new Employee("007","Adele","Sep 04","123456789","0935 666 666","hothaodn@gmail.com","Uni","Sales",1000));
        employeeList.add(new Employee("008","Katy","Sep 04","123456789","0935 666 666","hothaodn@gmail.com","Uni","Sales",1000));
        employeeList.add(new Employee("009","Kesha","Sep 04","123456789","0935 666 666","hothaodn@gmail.com","Uni","Sales",1000));
        employeeList.add(new Employee("010","Rosie","Sep 04","123456789","0935 666 666","hothaodn@gmail.com","Uni","Sales",1000));
        FuncEmployeeFileCSV.writeFileCSV(employeeList);

//        MainController.processMain();
        EmployeeController.showEmployeesInfo();
    }
}

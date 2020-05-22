package controllers;

import models.Customer;
import models.Room;
import service.impl.CustomerImpl;
import service.impl.FuncReadServicesFileCSV;
import service.impl.FuncRecordCustomerFileCSV;
import service.impl.FuncRecordServicesFileCSV;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerController {
    public static void addNewCustomer(){
        Scanner input = new Scanner(System.in);
        System.out.println("How many rooms customers do you want to add? ");
        int length = Integer.parseInt(input.nextLine());
        ArrayList<Customer> customersList = FuncRecordCustomerFileCSV.getFileCSV();
        for ( int i = 0; i < length; i++){
            Customer customer = CustomerImpl.addNewCustomer();
            customersList.add(customer);
        }
        FuncRecordCustomerFileCSV.setFileCSV(customersList);
        MainController.processMain();
    }

    public static void showInformationCustomers(){
        ArrayList<Customer> list = FuncRecordCustomerFileCSV.getFileCSV();
        for(Customer element : list){
            System.out.println(element.showInfor());
        }
    }
}

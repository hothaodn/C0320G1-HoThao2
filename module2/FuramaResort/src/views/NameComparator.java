package views;

import models.Customer;
import service.impl.FuncCustomerFileCSV;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class NameComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer s1, Customer s2) {
        if(s1.getName().compareTo(s2.getName()) == 0) {
            return ( s1.getBirthday() - s2.getBirthday() );
        }
        return s1.getName().compareTo(s2.getName());
    }
}




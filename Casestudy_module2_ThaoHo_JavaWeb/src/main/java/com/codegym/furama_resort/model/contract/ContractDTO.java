package com.codegym.furama_resort.model.contract;

import com.codegym.furama_resort.model.customer.Customer;
import com.codegym.furama_resort.model.employee.Employee;
import com.codegym.furama_resort.model.hotelService.Service;

import javax.persistence.*;
import java.util.Set;

public class ContractDTO {
    private long idContract;
    private String checkInDate;
    private String checkOutDate;
    private Float deposit;
    private Float totalPayment;
    private long idCustomer;
    private long idEmployee;
    private int idService;
    private Set<DetailContract> detailContract;

    public ContractDTO() {
    }

    public long getIdContract() {
        return idContract;
    }

    public void setIdContract(long idContract) {
        this.idContract = idContract;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public Float getDeposit() {
        return deposit;
    }

    public void setDeposit(Float deposit) {
        this.deposit = deposit;
    }

    public Float getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(Float totalPayment) {
        this.totalPayment = totalPayment;
    }

    public long getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(long idCustomer) {
        this.idCustomer = idCustomer;
    }

    public long getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(long idEmployee) {
        this.idEmployee = idEmployee;
    }

    public int getIdService() {
        return idService;
    }

    public void setIdService(int idService) {
        this.idService = idService;
    }

    public Set<DetailContract> getDetailContract() {
        return detailContract;
    }

    public void setDetailContract(Set<DetailContract> detailContract) {
        this.detailContract = detailContract;
    }
}

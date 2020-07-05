package com.codegym.furama_resort.model.contract;

import com.codegym.furama_resort.model.customer.Customer;
import com.codegym.furama_resort.model.employee.Employee;
import com.codegym.furama_resort.model.hotelService.Service;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.util.Set;

@Entity
@Table(name="service_contract")
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_contract")
    private long idContract;

    @Column(name="check_in_date")
    private String checkInDate;

    @Column(name="check_out_date")
    private String checkOutDate;

    @Column(name="deposit")
    @Min(0)
    private Float deposit;

    @Column(name="total")
    @Min(0)
    private Float totalPayment;

    @ManyToOne
    @JoinColumn(name="id_customer", nullable=false)
    private Customer customer;

    @ManyToOne
    @JoinColumn(name="id_employee", nullable=false)
    private Employee employee;

    @OneToMany(mappedBy="contract")
    @Column(name="id_detail_contract")
    private Set<DetailContract> detailContract;

    @ManyToOne
    @JoinColumn(name="id_service", nullable=false)
    private Service service;

    @Column(name="created_contract_date")
    private String createdContractDate;

    @Column(name="updated_Contract_date")
    private String updatedContractDate;

    @Column(name="is_delete")
    private boolean isDelete;

    public Contract() {
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Set<DetailContract> getDetailContract() {
        return detailContract;
    }

    public void setDetailContract(Set<DetailContract> detailContract) {
        this.detailContract = detailContract;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public String getCreatedContractDate() {
        return createdContractDate;
    }

    public void setCreatedContractDate(String createdContractDate) {
        this.createdContractDate = createdContractDate;
    }

    public String getUpdatedContractDate() {
        return updatedContractDate;
    }

    public void setUpdatedContractDate(String updatedContractDate) {
        this.updatedContractDate = updatedContractDate;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }
}

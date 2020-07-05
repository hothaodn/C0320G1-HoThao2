package com.codegym.furama_resort.model.employee;

import com.codegym.furama_resort.model.contract.Contract;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.util.Set;

@Entity
@Table(name="employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_employee")
    private long idEmployee;

    @Column(name="name")
    private String nameEmployee;

    @Column(name="birthday")
    private String birthday;

    @Column(name="id_card_number")
    private String idCardNumber;

    @Column(name="phone_number")
    private String phoneNumber;

    @Column(name="email")
    private String email;

    @Column(name="education_level")
    private String educationLevel;

    @Column(name="department")
    private String department;

    @Column(name="position")
    private String position;

    @Column(name="salary")
    @Min(18)
    private Float salary;

    @OneToMany(mappedBy="employee")
    @Column(name="id_contract")
    private Set<Contract> contracts;

    @Column(name="is_delete")
    private boolean isDelete;

    public Employee() {
    }

    public long getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(long idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Set<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(Set<Contract> contracts) {
        this.contracts = contracts;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }
}

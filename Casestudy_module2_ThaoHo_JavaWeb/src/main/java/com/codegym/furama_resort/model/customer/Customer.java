package com.codegym.furama_resort.model.customer;

import com.codegym.furama_resort.model.contract.Contract;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Set;

@Entity
@Table(name="customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_customer")
    private long idCustomer;

    @Column(name="code_customer")
    @Pattern(regexp = "^KH-([0-9]{4})$",message = "Invalid format (KH-XXXX), X is a number")
//    @Size(min=5,max=10,message = "meomeo")
    private String codeCustomer;

    @Column(name="name")
//    @Pattern(regexp = "^[\\w]$",message = "Invalid characters")
    private String nameCustomer;

    @Column(name="birthday")
//    @NotNull
//    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private String birthday;

    @Column(name="id_card_number")
    @Pattern(regexp = "^([0-9]{9}|[0-9]{12})$",message = "Invalid ID card/passport")
    private String idCardNumber;

    @Column(name="phone_number")
    @Pattern(regexp = "^(090|091|\\+8490|\\+8491)[0-9]{7}$",message = "Invalid phone number")
    private String phoneNumber;

    @Column(name="email")
    @NotBlank
    @Email(message = "Invalid email")
    private String email;

    @Column(name="address")
    private String address;

    @Column(name="customer_type")
    private String customerType;

    @OneToMany(mappedBy="customer")
    @Column(name="id_contract")
    private Set<Contract> contract;

    @Column(name="is_delete")
    private boolean isDelete;

    public Customer() {
    }

    public long getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(long idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getCodeCustomer() {
        return codeCustomer;
    }

    public void setCodeCustomer(String codeCustomer) {
        this.codeCustomer = codeCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public Set<Contract> getContract() {
        return contract;
    }

    public void setContract(Set<Contract> contract) {
        this.contract = contract;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }
}

package com.codegym.furama_resort.model.hotelService;

import com.codegym.furama_resort.model.contract.Contract;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import java.util.Set;

@Entity
@Table(name="service")
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_service")
    private int idService;

    @Column(name="code_service")
    @Pattern(regexp = "^DV-([0-9]{4})$",message = "Invalid format (DV-XXXX), X is a number")
    private String codeService;

    @Column(name="name_of_accommodation")
    private String nameOfAccommodation;

    @Column(name="using_area")
    @Min(0)
    private Integer usingArea;

    @Column(name="rental_fee")
    @Min(0)
    private Integer rentalFee;

    @Column(name="max_occupancies")
    @Min(0)
    private Integer maxOccupancies;

    @Column(name="rental_type")
    private String rentalType;

    @Column(name="is_delete")
    private boolean isDelete;

    @Column(name="room_standard")
    private String roomStandard;

    @Column(name="facilities")
    private String facilities;

    @Column(name="number_of_floor")
    @Min(0)
    private Integer numberOfFloor;

    @Column(name="pool_area")
    @Min(0)
    private Integer poolArea;

    @Column(name="free_extra_service")
    private String freeExtraService;

    @OneToMany(mappedBy="service")
    @Column(name="id_contract")
    private Set<Contract> contract;

    public Service() {
    }

    public int getIdService() {
        return idService;
    }

    public void setIdService(int idService) {
        this.idService = idService;
    }

    public String getCodeService() {
        return codeService;
    }

    public void setCodeService(String codeService) {
        this.codeService = codeService;
    }

    public Set<Contract> getContract() {
        return contract;
    }

    public void setContract(Set<Contract> contract) {
        this.contract = contract;
    }

    public String getNameOfAccommodation() {
        return nameOfAccommodation;
    }

    public void setNameOfAccommodation(String nameOfAccommodation) {
        this.nameOfAccommodation = nameOfAccommodation;
    }

    public Integer getUsingArea() {
        return usingArea;
    }

    public void setUsingArea(Integer usingArea) {
        this.usingArea = usingArea;
    }

    public Integer getRentalFee() {
        return rentalFee;
    }

    public void setRentalFee(Integer rentalFee) {
        this.rentalFee = rentalFee;
    }

    public Integer getMaxOccupancies() {
        return maxOccupancies;
    }

    public void setMaxOccupancies(Integer maxOccupancies) {
        this.maxOccupancies = maxOccupancies;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getFacilities() {
        return facilities;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities;
    }

    public Integer getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(Integer numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    public Integer getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(Integer poolArea) {
        this.poolArea = poolArea;
    }

    public String getFreeExtraService() {
        return freeExtraService;
    }

    public void setFreeExtraService(String freeExtraService) {
        this.freeExtraService = freeExtraService;
    }

    public Set<Contract> getServiceContracts() {
        return contract;
    }

    public void setServiceContracts(Set<Contract> contracts) {
        this.contract = contracts;
    }


}

package com.codegym.furama_resort.model.contract;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="accompanied_service")
public class AccompaniedService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_accompanied_service")
    private int idAccompaniedService;

    @Column(name="name_accompanied_service")
    private String nameAccompaniedService;

    @Column(name="price")
    private float price;

    @Column(name="unit")
    private String unit;

    @OneToMany(mappedBy="accompaniedService")
    @Column(name="id_detail_contract")
    private Set<DetailContract> detailContracts;

    @Column(name="is_delete")
    private boolean isDelete;

    public AccompaniedService() {
    }

    public int getIdAccompaniedService() {
        return idAccompaniedService;
    }

    public void setIdAccompaniedService(int idAccompaniedService) {
        this.idAccompaniedService = idAccompaniedService;
    }

    public String getNameAccompaniedService() {
        return nameAccompaniedService;
    }

    public void setNameAccompaniedService(String nameAccompaniedService) {
        this.nameAccompaniedService = nameAccompaniedService;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Set<DetailContract> getDetailContracts() {
        return detailContracts;
    }

    public void setDetailContracts(Set<DetailContract> detailContracts) {
        this.detailContracts = detailContracts;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }
}

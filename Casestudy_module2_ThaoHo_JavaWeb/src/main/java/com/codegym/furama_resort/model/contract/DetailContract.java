package com.codegym.furama_resort.model.contract;

import javax.persistence.*;

@Entity
@Table(name="detail_contract")
public class DetailContract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_detail_contract")
    private long idDetailContract;

    @ManyToOne
    @JoinColumn(name="id_accompanied_service", nullable=false)
    private AccompaniedService accompaniedService;

    @ManyToOne
    @JoinColumn(name="id_contract", nullable=false)
    private Contract contract;

    @Column(name="quanlity")
    private int quanlity;

    public DetailContract() {
    }

    public long getIdDetailContract() {
        return idDetailContract;
    }

    public void setIdDetailContract(long idDetailContract) {
        this.idDetailContract = idDetailContract;
    }

    public AccompaniedService getAccompaniedService() {
        return accompaniedService;
    }

    public void setAccompaniedService(AccompaniedService accompaniedService) {
        this.accompaniedService = accompaniedService;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public int getQuanlity() {
        return quanlity;
    }

    public void setQuanlity(int quanlity) {
        this.quanlity = quanlity;
    }
}

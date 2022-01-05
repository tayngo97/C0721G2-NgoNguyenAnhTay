package com.example.furama.model.contract;


import javax.persistence.*;

@Entity
@Table(name="contract_detail")
public class ContractDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer DetailId;

    private int quantity;

    @ManyToOne
    @JoinColumn(name="contract_id")
    private Contract contracts;



    @ManyToOne
    @JoinColumn(name="attach_service_id")
    private AttachService attachService;


    public ContractDetail() {
    }

    public Integer getDetailId() {
        return DetailId;
    }

    public void setDetailId(Integer detailId) {
        DetailId = detailId;
    }

    public Contract getContracts() {
        return contracts;
    }

    public void setContracts(Contract contracts) {
        this.contracts = contracts;
    }

    public AttachService getAttachService() {
        return attachService;
    }

    public void setAttachService(AttachService attachService) {
        this.attachService = attachService;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

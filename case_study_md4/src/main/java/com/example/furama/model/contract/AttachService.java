package com.example.furama.model.contract;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="attach_service")
public class AttachService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer attachId;

    private String attachName;

    private double attachCost;

    private int attachService;

    private int attachStatus;


    @OneToMany(targetEntity = ContractDetail.class,mappedBy = "attachService")
    private List<ContractDetail> contractDetail;





    public List<ContractDetail> getContractDetail() {
        return contractDetail;
    }

    public void setContractDetail(List<ContractDetail> contractDetail) {
        this.contractDetail = contractDetail;
    }

    public AttachService() {
    }

    public Integer getAttachId() {
        return attachId;
    }

    public void setAttachId(Integer attachId) {
        this.attachId = attachId;
    }

    public String getAttachName() {
        return attachName;
    }

    public void setAttachName(String attachName) {
        this.attachName = attachName;
    }

    public double getAttachCost() {
        return attachCost;
    }

    public void setAttachCost(double attachCost) {
        this.attachCost = attachCost;
    }

    public int getAttachService() {
        return attachService;
    }

    public void setAttachService(int attachService) {
        this.attachService = attachService;
    }

    public int getAttachStatus() {
        return attachStatus;
    }

    public void setAttachStatus(int attachStatus) {
        this.attachStatus = attachStatus;
    }


}




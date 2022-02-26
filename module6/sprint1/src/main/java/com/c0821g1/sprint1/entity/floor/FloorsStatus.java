package com.c0821g1.sprint1.entity.floor;


import javax.persistence.*;
import java.util.List;

@Entity
public class FloorsStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int floorStatusId;

    private String floorStatusName;

    @OneToMany(mappedBy = "floorsStatus")
    private List<Floors> floorsList;

    public FloorsStatus() {
    }

    public FloorsStatus(int floorStatusId, String floorStatusName, List<Floors> floorsList) {
        this.floorStatusId = floorStatusId;
        this.floorStatusName = floorStatusName;
        this.floorsList = floorsList;
    }

    public int getFloorStatusId() {
        return floorStatusId;
    }

    public void setFloorStatusId(int floorStatusId) {
        this.floorStatusId = floorStatusId;
    }

    public String getFloorStatusName() {
        return floorStatusName;
    }

    public void setFloorStatusName(String floorStatusName) {
        this.floorStatusName = floorStatusName;
    }

    public List<Floors> getFloorsList() {
        return floorsList;
    }

    public void setFloorsList(List<Floors> floorsList) {
        this.floorsList = floorsList;
    }
}

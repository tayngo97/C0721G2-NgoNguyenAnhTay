package ManagerOfficerSystem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class ManagerOfficer {
    private Collection<Offiicer> offiicers ;


    public ManagerOfficer() {
        this.offiicers = new ArrayList<>();
    }

    public void addOfficer(Offiicer offiicer){
        this.offiicers.add(offiicer);
    }

    public Collection<Offiicer> searchInfo(String name){
       return offiicers.stream().filter(i -> i.getName().contains(name)).collect(Collectors.toList());
    }


    public void showInfoList(){
        offiicers.forEach(i -> System.out.println( "List : " +i.toString() + " "));
    }

}

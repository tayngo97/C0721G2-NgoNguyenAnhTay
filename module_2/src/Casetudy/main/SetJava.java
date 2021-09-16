package Casetudy.main;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetJava {
    public static void main(String[] args) {
        Set<Integer> integers =  new HashSet<>();
        integers.add(3);
        integers.add(10);
        integers.add(11);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        integers.add(6);
        System.out.println(integers);

        System.out.println(integers.isEmpty());
    }
}

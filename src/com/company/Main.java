package com.company;

import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Set<City> set=new TreeSet<>();
        set.add(new City(1,"Kirghizia"));
        set.add(new City(2,"Russia"));
        set.add(new City(3,"New-Yourk"));
        set.add(new City(4,"Uzbekistan"));
        set.add(new City(5,"Tajikistan"));
        System.out.println(set);
        for (City c:set
        ) {
            if (c.getCode()%2==1) {
                Set<City> cities = new TreeSet<>();
                cities.add(c);
                for (City v:cities
                ) {
                    System.out.println("Ofter :  "+v);

                }
            }
        }
    }
}

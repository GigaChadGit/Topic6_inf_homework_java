package com.sibsutis.devices;

import java.util.HashSet;

public class PersonalComputer extends Device {
    public PersonalComputer(int id, int price, String ip) {
        super(id, price, ip);
    }
    
    @Override
    public String getDeviceType() {
        return "PersonalComputer";
    }

    public static void computer(String[] args) {
        HashSet<Device> model = new HashSet<>();
        model.add(new PersonalComputer(1, 42, "42.52.22.222"));
        model.add(new PersonalComputer(2, 2, "22.22.22.1111"));

        System.out.println(model.contains(new PersonalComputer(1, 42,"42.52.22.222" ))); // true
        System.out.println(model.contains(new PersonalComputer(2, 3,"22.22.22.1111" ))); // false
    }

}
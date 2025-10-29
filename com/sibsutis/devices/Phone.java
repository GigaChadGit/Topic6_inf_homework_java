package com.sibsutis.devices;

import java.util.HashSet;

public class Phone extends Device {
    public Phone(int id, int price, String ip) {
        super(id, price, ip);
    }
    
    @Override
    public String getDeviceType() {
        return "Phone";
    }

    public static void phone(String[] args) {
        HashSet<Device> model = new HashSet<>();
        model.add(new Phone(1, 1, "52.52.55.332"));
        model.add(new Phone(2, 33, "32.12.23.222"));

        System.out.println(model.contains(new Phone(1, 42,"42.52.22.222" ))); // false
        System.out.println(model.contains(new Phone(2, 33,"22.22.22.1111" ))); // true
    }
}
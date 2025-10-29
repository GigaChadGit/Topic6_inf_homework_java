package com.sibsutis.devices;

public class Phone extends Device {
    public Phone(int id, int price, String ip) {
        super(id, price, ip);
    }
    
    @Override
    public String getDeviceType() {
        return "Phone";
    }
}
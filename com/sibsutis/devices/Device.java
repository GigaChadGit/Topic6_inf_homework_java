package com.sibsutis.devices;

import com.sibsutis.Printable   ;

public abstract class Device implements Printable {
    private int id;
    private int price;
    private String ip; // может быть null

    public Device(int id, int price, String ip) {
        this.id = id;
        this.price = price;
        this.ip = ip;
    }

    public int getId() { return id; }
    public int getPrice() { return price; }
    public String getIp() { return ip; }

    // описание метода интерфейса
    public String print() {
        return String.format("%s: id = %d, price = %d, %ip = %s",
                             getDeviceType(), id, price, ip == null ? "null" : ip);

    }

    public abstract String getDeviceType();

}

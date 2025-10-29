package com.sibsutis.devices;

import com.sibsutis.Printable;
import java.util.Objects;

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

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Device device = (Device) obj;
        return id == device.id && price == device.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, price);
    }

}

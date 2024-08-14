package de.vimo;

public class SilverWheel implements Wheel{
    int red = 0;
    int blue = 90;
    int green = 10;
    long serialNumber = 238764169l;
    double diameter = 33.2;
    String color = "silverWheel";

    @Override
    public long getSerialNumber() {
        return serialNumber;
    }

    @Override
    public double getDiameter() {
        return diameter;
    }

    @Override
    public String getColor() {
        return color;
    }
}

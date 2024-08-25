package de.vimo;

public class BlackWheel implements Wheel{
    int red = 100;
    int blue = 0;
    int green = 0;
    String color = "blackWheel";
    long serialNumber = 4444L;
    double diameter = 52.2;


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

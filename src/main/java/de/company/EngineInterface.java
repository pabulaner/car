package de.vimo;

public interface EngineInterface {
    long getSerialNumber();

    double getHorsePower();

    void switchGearUp();

    void switchGearDown();

    int getMaxGear();

    int getGear();
}

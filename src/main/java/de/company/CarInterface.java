package de.vimo;

public interface CarInterface {
    long getSerialNumber();

    Engine getEngine();

    Wheel getFrontLeftWheel();

    Wheel getFrontRightWheel();

    Wheel getBackLeftWheel();

    Wheel getBackRightWheel();
}

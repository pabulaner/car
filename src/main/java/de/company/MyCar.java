package de.vimo;

public class MyCar implements CarInterface{

    private long serialNumberCar = 33333l;
    private Engine engine;
    private Wheel wheel;

    public MyCar(BlackWheel blackWheel) {
        engine = new Engine();
        wheel = blackWheel;
    }
    public MyCar(SilverWheel silverWheel) {
        wheel = silverWheel;
    }

    @Override
    public long getSerialNumber() {
        return serialNumberCar;
    }

    @Override
    public Engine getEngine() {
        return engine;
    }

    @Override
    public Wheel getFrontLeftWheel() {
        return wheel;
    }

    @Override
    public Wheel getFrontRightWheel() {
        return wheel;
    }

    @Override
    public Wheel getBackLeftWheel() {
        return wheel;
    }

    @Override
    public Wheel getBackRightWheel() {
        return wheel;
    }
}

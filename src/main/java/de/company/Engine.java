package de.vimo;

public class Engine implements EngineInterface{

    private final String engine = "best engine";
    public String getEngine() {
        return engine;
    }

    @Override
    public long getSerialNumber() {
        return 8888L;
    }

    @Override
    public double getHorsePower() {
        return 220.88;
    }

    @Override
    public void switchGearUp() {

    }

    @Override
    public void switchGearDown() {

    }

    @Override
    public int getMaxGear() {
        return 6;
    }

    @Override
    public int getGear() {
        return 4;
    }
}

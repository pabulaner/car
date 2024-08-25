package de.vimo;

public class MyCar implements CarInterface{

    private final long serialNumberCar = 33333L;
    private BlackSeat passengerSeat;
    private Engine engine;
    private Wheel wheelFrontLeftWheel;
    private Wheel wheelFrontRightWheel;
    private Wheel wheelBackLeftWheel;
    private Wheel wheelBackRightWheel;
    private BlackSeat driverSeat;

    public MyCar(BlackWheel blackFrontLeftWheel,BlackWheel blackFrontRightWheel,BlackWheel blackBackLeftWheel,BlackWheel blackBackRightWheel) {
        engine = new Engine();
        wheelFrontLeftWheel = blackFrontLeftWheel;
        wheelFrontRightWheel = blackFrontRightWheel;
        wheelBackLeftWheel = blackBackLeftWheel;
        wheelBackRightWheel = blackBackRightWheel;
    }
    public MyCar(SilverWheel silverFrontLeftWheel,SilverWheel silverFrontRightWheel,SilverWheel silverBackLeftWheel,SilverWheel silverBackRightWheel) {
        engine = new Engine();
        wheelFrontLeftWheel = silverFrontLeftWheel;
        wheelFrontRightWheel = silverFrontRightWheel;
        wheelBackLeftWheel = silverBackLeftWheel;
        wheelBackRightWheel = silverBackRightWheel;
    }
    public MyCar() {
        driverSeat = new BlackSeat();
        passengerSeat = new BlackSeat();
    }

    public BlackSeat getDriverSeat() {
        return driverSeat;
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
        return wheelFrontLeftWheel;
    }

    @Override
    public Wheel getFrontRightWheel() {
        return wheelFrontRightWheel;
    }

    @Override
    public Wheel getBackLeftWheel() {
        return wheelBackLeftWheel;
    }

    @Override
    public Wheel getBackRightWheel() {
        return wheelBackRightWheel;
    }
}

package de.vimo;

public class Car {
    private SilverWheel silverWheel;
    public Car(SilverWheel silverWheel) {
        this.silverWheel = silverWheel;
    }

    BlackSeat driverSeat = new BlackSeat();
    BlackSeat passengerSeat = new BlackSeat();

    public BlackSeat getDriverSeat() {
        return driverSeat;
    }
    public String getSilverWheel() {
        return silverWheel.getSilverWheel();
    }

}

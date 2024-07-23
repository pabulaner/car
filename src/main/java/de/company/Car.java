package de.vimo;

public class Car {
    private SilverWheel silverWheel;
    private BlackWheel blackWheel;
    public Car(SilverWheel silverWheel) {
        this.silverWheel = silverWheel;
    }
    public Car(BlackWheel blackWheel) {
        this.blackWheel = blackWheel;
    }

    BlackSeat driverSeat = new BlackSeat();
    BlackSeat passengerSeat = new BlackSeat();

    public BlackSeat getDriverSeat() {
        return driverSeat;
    }
    public String getSilverWheel() {
        return silverWheel.getSilverWheel();
    }
    public String getBlackWheel() {
        return blackWheel.getBlackWheel();
    }

}

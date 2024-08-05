package de.vimo;


public class Car {
    private static BlackWheel blackWheelFrontLeft;
    private static SilverWheel silverWheelFrontRight;
    private Wheel wheelFrontLeft;
    private Wheel wheelFrontRight;
    private Wheel wheelRearLeft;
    private Wheel wheelRearRight;


    public Car(Wheel wheelFrontLeft, Wheel wheelFrontRight) {
        if (wheelFrontLeft == blackWheelFrontLeft) {
        this.wheelFrontLeft = wheelFrontLeft;
        //blackWheelFrontLeft = new BlackWheel();
        } else if (wheelFrontRight == silverWheelFrontRight) {
            this.wheelFrontRight = wheelFrontRight;
            //blackWheelFrontLeft = new BlackWheel();
        }
    }
    BlackSeat driverSeat = new BlackSeat();
    BlackSeat passengerSeat = new BlackSeat();

    public BlackSeat getDriverSeat() {
        return driverSeat;
    }
    public String getWheel() {
        return wheelFrontLeft.getWheel() + wheelFrontRight.getWheel();
    }

    public static void main(String[] args) {
        Car car = new Car(blackWheelFrontLeft,silverWheelFrontRight);
        //System.out.println(car.getWheel());
        BlackWheel blackWheelFrontLeft = new BlackWheel();
        SilverWheel silverWheelFrontRight = new SilverWheel();
        //blackWheelFrontLeft.getColor();
        blackWheelFrontLeft.setWheel(blackWheelFrontLeft);
        silverWheelFrontRight.setWheel(silverWheelFrontRight);
        //blackWheelFrontLeft.isWheel();
    }
}

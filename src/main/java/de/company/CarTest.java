package de.vimo;

public class CarTest
{

    public static void main(String[] args )
    {
        SilverWheel silverWheel = new SilverWheel();
        Car car = new Car(silverWheel);

        System.out.println(car.getSilverWheel());

        BlackSeat driverSeat = car.getDriverSeat();
        driverSeat.sitDown();
        System.out.println(car.getDriverSeat().isSitDown());
        driverSeat.standUp();
        System.out.println(driverSeat.isSitDown());
    }
}

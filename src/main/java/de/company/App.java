package de.vimo;


public class App 
{
    public static void main( String[] args )
    {
        MyCar myCarBlackWheel = new MyCar(new BlackWheel(),new BlackWheel(),new BlackWheel(),new BlackWheel());

        System.out.println("FrontLeftWheel : Color is " + myCarBlackWheel.getFrontLeftWheel().getColor() + " SerialNumber is " + myCarBlackWheel.getFrontLeftWheel().getSerialNumber() + " diameter is " + myCarBlackWheel.getFrontLeftWheel().getDiameter() + "\n");
        System.out.println("FrontRightWheel : Color is " + myCarBlackWheel.getFrontRightWheel().getColor() + " SerialNumber is " + myCarBlackWheel.getFrontRightWheel().getSerialNumber() + " diameter is " + myCarBlackWheel.getFrontRightWheel().getDiameter() + "\n");
        System.out.println("BackRightWheel : Color is " + myCarBlackWheel.getBackRightWheel().getColor() + " SerialNumber is " + myCarBlackWheel.getBackRightWheel().getSerialNumber() + " diameter is " + myCarBlackWheel.getBackRightWheel().getDiameter() + "\n");
        System.out.println("BackLeftWheel : Color is " + myCarBlackWheel.getBackLeftWheel().getColor() + " SerialNumber is " + myCarBlackWheel.getBackLeftWheel().getSerialNumber() + " diameter is " + myCarBlackWheel.getBackLeftWheel().getDiameter() + "\n");
        System.out.println("Engine is type " + myCarBlackWheel.getEngine().getEngine() + " SerialNumber is " + myCarBlackWheel.getEngine().getSerialNumber() + " HorsePower " + myCarBlackWheel.getEngine().getHorsePower() + "\n");
        System.out.println("Car SerialNumber is " + myCarBlackWheel.getSerialNumber() + "\n");

        MyCar car = new MyCar();
        BlackSeat driverSeat = car.getDriverSeat();
        driverSeat.sitDown();
        System.out.println(car.getDriverSeat().isSitDown());
        driverSeat.standUp();
        System.out.println(driverSeat.isSitDown());
    }
}

package de.vimo;


public class App 
{
    public static void main( String[] args )
    {
        MyCar myCarBlack = new MyCar(new BlackWheel());
        System.out.println(myCarBlack.getFrontLeftWheel().getColor());
        System.out.println(myCarBlack.getFrontRightWheel().getColor());

        MyCar myCarSilver = new MyCar(new SilverWheel());
        System.out.println(myCarSilver.getBackLeftWheel().getColor());
        System.out.println(myCarSilver.getBackRightWheel().getColor());
    }
}

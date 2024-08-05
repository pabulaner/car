package de.vimo;

public class SilverWheel implements Wheel {
    int red = 0;
    int blue = 90;
    int green = 10;
    String silverWheel = "silverwheel";
    private boolean isSilverWheel;
    public String getColor() {
        System.out.println(red);
        return red + "red";
    }
    public boolean isWheel() {
        return isSilverWheel;
    }
    public void setWheel(Wheel wheel) {
        isSilverWheel = true;
        System.out.println("isSilverWheel " + isSilverWheel + " setWheel ");
    }
    public String getWheel() {
        return silverWheel;
    }
}

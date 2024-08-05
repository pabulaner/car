package de.vimo;

public class BlackWheel implements Wheel {
    int red = 100;
    int blue = 0;
    int green = 0;
    String blackWheel = "blackwheel";
    private boolean isBlackWheel;

    public String getColor() {
        System.out.println(red);
        return red + "red";
    }
    public boolean isWheel() {
        System.out.println(isBlackWheel + " isWheel");
        return isBlackWheel;
    }
    public void setWheel(Wheel wheel) {
        isBlackWheel = true;
        System.out.println("isBlackWheel " + isBlackWheel + " setWheel ");
    }
    public String getWheel() {
        //System.out.println(blackWheel + " getWheel");
        return blackWheel;
    }
}


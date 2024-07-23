package de.vimo;

public class BlackSeat {
    int red = 33;
    int blue = 33;
    int green = 33;
    private boolean isSitDown;

    public boolean isSitDown() {
        return isSitDown;
    }

    public void sitDown() {
        isSitDown = true;
    }

    public void standUp() {
        isSitDown = false;
    }
}

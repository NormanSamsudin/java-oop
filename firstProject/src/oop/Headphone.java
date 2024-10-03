package oop;

public class Headphone {

    String charge = "Micro USB";
    String[] controls = { "power", "volume", "skip", "play/pause" };
    String color = "Red/Blask";

    static boolean power = false;

    public void setPower() {

        if (power == true) {
            power = false;
        } else {
            power = true;
        }
    }

}

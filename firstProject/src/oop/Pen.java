package oop;

public class Pen {
    String type = "gel";
    String color = "blue";
    int point = 10;

    public static boolean clicked = false;

    public static  void click() {
        clicked = true;
    }

    public static  void unClicked() {
        clicked = false;
    }
}

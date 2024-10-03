package oop;

public class Pen implements InterfaceExample {
    String type = "gel";
    String color = "blue";
    int point = 10;

    public static boolean clicked = false;

    public static void click() {
        clicked = true;
    }

    public static void unClicked() {
        clicked = false;
    }

    @Override
    public void fillup() {
        System.out.println("test interface");
    }

    @Override
    public void pourUp() {

        throw new UnsupportedOperationException("Unimplemented method 'pourUp'");
    }
}

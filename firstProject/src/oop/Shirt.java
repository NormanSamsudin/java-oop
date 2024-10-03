package oop;

/**
 * Shirt
 */
public class Shirt implements InterfaceExample {
    private String color;
    private String brand;
    private double price;

    // Default constructor (optional parameters)
    public Shirt() {
        this.color = "Unknown"; // Default color
        this.brand = "Unknown"; // Default brand
        this.price = 0.0; // Default price
    }

    Shirt(String color, String brand, double price) {
        this.color = color;
        this.brand = brand;
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void fillup() {

        // throw new UnsupportedOperationException("Unimplemented method 'fillup'");
        System.out.println("test interface");
    }

    @Override
    public void pourUp() {
        throw new UnsupportedOperationException("Unimplemented method 'pourUp'");
    }

}
package org.example;

public class Mouse1 extends Mouse {

    private String name;
    private String brand;

    public String getName() {
        return name;
    }

    public  void setName(String name) {
        this.name = name;

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;

    }

    public void Color() {
        System.out.println("Pink! ");
    }
    @Override
    public void scrollDownColor() {
        System.out.println("Green!: Scrolling Down Color. ");
    }
}

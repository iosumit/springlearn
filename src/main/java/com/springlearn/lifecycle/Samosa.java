package com.springlearn.lifecycle;

public class Samosa {
    private double price;

    public Samosa() {
    }

    @Override
    public String toString() {
        return "Samosa [price=" + price + "]";
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void init() {
        System.out.println("Samosa Initilize");
    }

    public void destroyed() {
        System.out.println("Samosa destroyed");
    }
}

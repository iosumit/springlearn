package com.springlearn.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Beer {
    private double price;

    public Beer() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @PostConstruct
    public void initilize() {
        System.out.println("Beer Initilized");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Beer destroyed");
    }

    @Override
    public String toString() {
        return "Beer [price=" + price + "]";
    }
}

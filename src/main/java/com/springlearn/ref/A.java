package com.springlearn.ref;

public class A {
    private int a;
    private B b;

    @Override
    public String toString() {
        return "A [a=" + a + ", b=" + b + "]";
    }

    public A() {
    }

    public A(int a, B b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

}

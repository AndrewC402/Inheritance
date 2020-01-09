package com.qa.inheritance;

public abstract class AAA {

    private int x = 7;

    public AAA() {

    }

    public int fooBar() {
        x = 9;
        System.out.println("AAA::foodBar()");
        return 3;
    }

    public abstract void f1();
}

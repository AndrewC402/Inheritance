package com.qa.aggregates;

public class AAA implements IAAA{

    private int x = 7;

    public AAA() {

    }

    public int fooBar() {
        x = 9;
        System.out.println("AAA::foodBar()");
        return 3;
    }

    public void f1() {
        System.out.println("Shouldn't be here");
    }

    private void f2() {
        System.out.println("AAA:f2()");
    }
}

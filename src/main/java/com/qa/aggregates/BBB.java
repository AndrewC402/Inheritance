package com.qa.inheritance;

public class BBB extends AAA {

    public int fooBar() {

        System.out.println("BBB::foodBar()");

        return 99;
    }

    @Override
    public void f1() {
        System.out.println("This is an overridden method");
    }

}

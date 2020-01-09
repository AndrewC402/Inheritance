package com.qa.aggregates;

//replacing inheritance with aggregates
public class BBB {

    private AAA parent = new AAA(); //create private variable of type the parent class

    public int fooBar() {

        parent.fooBar();
        System.out.println("BBB::foodBar()");

        return 99;
    }

    public void f1() {
        System.out.println("BBB::f1");
    }

}

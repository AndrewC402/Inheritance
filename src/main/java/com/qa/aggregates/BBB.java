package com.qa.aggregates;

//replacing inheritance with aggregates
public class BBB {

    private IAAA parent;

    public BBB (IAAA theParent) {
        parent = theParent;
    }

    public int fooBar() {

        parent.fooBar(); //AAA cannot be tested separately from BBB
        System.out.println("BBB::foodBar()");

        return 99;
    }

    public void f1() {
        System.out.println("BBB::f1");
    }

}

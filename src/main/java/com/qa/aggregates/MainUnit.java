package com.qa.aggregates;

public class MainUnit {

    public static void main(String[] args) {

        BBB parent = new BBB(new AAA());

        parent.fooBar();
        parent.f1();

    }
}

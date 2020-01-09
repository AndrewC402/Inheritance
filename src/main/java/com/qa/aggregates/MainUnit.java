package com.qa.aggregates;

public class MainUnit {

    public static void main(String[] args) {

        AAA root = new AAA();
        BBB parent = new BBB(root);

        parent.fooBar();

    }
}

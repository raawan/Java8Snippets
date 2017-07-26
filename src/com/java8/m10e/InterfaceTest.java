package com.java8.m10e;

interface i1 {
    String name = "name1";
}

interface i2 extends i1 {
    String name = "name2";
    String anotherName = "name3";
}

public class InterfaceTest implements i2 {

    public static void main(String[] args) {
        System.out.println("=================================");
        InterfaceTest itest = new InterfaceTest();
        System.out.println(itest.name);
        System.out.println(itest.anotherName);

        System.out.println("=================================");
        i1 interface1 = new InterfaceTest();
        System.out.println(interface1.name);

        System.out.println("=================================");
        i2 interface2 = new InterfaceTest();
        System.out.println(interface2.name);
        System.out.println(interface2.anotherName);
        System.out.println("=================================");
    }
}

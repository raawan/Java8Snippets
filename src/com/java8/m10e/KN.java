package com.java8.m10e;


abstract class Super {
    public static int a = 3;
    public int b =10;

}

public class KN extends Super {

    public static int a = 5;
    public int b = 0;

    public static void main(String[] args) {
        Super knSuper = new KN();
        KN knkn = new KN();

        System.out.println(knSuper.b);
        System.out.println(knkn.b);
        System.out.println(Super.a);
        System.out.println(a);

    }
}

package com.java8.m10e;

import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;

/**
 * Created by minal on 5/10/17.
 */
public class ConstructorTest {

    int i;
    ConstructorTest() {
        this(1);
    }

    ConstructorTest(int i) {
        this.i=i;
    }

    public static void main(String[] args) {
        ConstructorTest constructorTest = new ConstructorTest();
        System.out.println(constructorTest.i);
    }
}

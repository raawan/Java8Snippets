package com.java8.m10e;

/**
 * Created by minal on 5/10/17.
 */
class ClassWIthStaticProtectedVar {

    static protected int count = 2;

}

public class StaticProtectedVariable extends ClassWIthStaticProtectedVar {
    //int count = 3;
    static int count = 4;
    public static void main(String[] args) {
        StaticProtectedVariable spv = new StaticProtectedVariable();
        System.out.println(spv.count);
    }
}
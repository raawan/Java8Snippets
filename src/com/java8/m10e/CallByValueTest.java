package com.java8.m10e;

/**
 * Created by minal on 5/11/17.
 */
public class CallByValueTest {

    public static void main(String[] args) {

        Student student = new Student();
        student.subject = "chemistry";
        changeName(student);
        System.out.println(student.subject);

    }

    public static void changeName(Student student) {
        //student.subject = "physics"; //prints physics
        student = null; // wont throw NPE
    }
}

class Student {
    public String subject;
}

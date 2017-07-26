package com.java8.m10e.object;

/**
 * Created by minal on 5/16/17.
 */
public class Person {

    private String id;
    private String firstname;

    public Person(String id) {
        this.id=id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Override
    public boolean equals(Object o) {
        if(o==null) {
            return false;
        }
        if(!(o instanceof Person)) {
            return false;
        }
        Person p = (Person)o;
        if (!this.id.equals(p.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return id;
    }
}

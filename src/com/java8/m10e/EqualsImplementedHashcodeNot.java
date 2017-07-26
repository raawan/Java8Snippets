package com.java8.m10e;

import com.java8.m10e.object.Person;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by minal on 5/16/17.
 */
public class EqualsImplementedHashcodeNot {

    public static void main(String[] args) {
        Person p1 = new Person("1");
        Person p2 = new Person("1");
        Map<Person,String> mapOfPeople = new HashMap<>();
        mapOfPeople.put(p1,"Minal");
        mapOfPeople.put(p2,"Snehal");
        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(mapOfPeople.get(p1).toString());
        System.out.println(mapOfPeople.get(p2).toString());
        System.out.println(mapOfPeople.containsValue("Minal"));
    }
    /*
    conclusion:if two objects are equals() but different hashcodes,
    you will still find your objects using the keys whuch are equals
    but with different hascodes. its just not performant
     */
    /*
    not correct conclusion
    http://eclipsesource.com/blogs/2012/09/04/the-3-things-you-should-know-about-hashcode/

     */
}

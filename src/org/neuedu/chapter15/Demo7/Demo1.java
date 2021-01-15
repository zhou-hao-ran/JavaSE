package org.neuedu.chapter15.Demo7;

import java.util.TreeSet;

public class Demo1 {
    public static void main(String[] args) {
        TreeSet set=new TreeSet(new Student());
        Student s1 = new Student("tom", 22);
        Student s2 = new Student("lucy", 23);
        Student s3 = new Student("ella", 24);
        Student s4 = new Student("bob", 25);
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        System.out.println(set);
    }
}

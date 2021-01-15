package org.neuedu.chapter15.Demo6;

import org.neuedu.chapter02.Demo01;

import java.util.HashSet;
import java.util.Set;

public class Demo1 {
    public static void main(String[] args) {
        Set set =new HashSet();
        set.add(1);
        set.add("hello");
        set.add(true);
        set.add(9.9);
        set.add(new Demo01());
        set.add("hello");//set可以去重
        System.out.println(set);
        System.out.println(set.size());
        for (Object o : set) {
            System.out.println(o);//set没有下标，只能遍历
        }
    }
}

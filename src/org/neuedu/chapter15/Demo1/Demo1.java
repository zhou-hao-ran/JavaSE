package org.neuedu.chapter15.Demo1;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.get(1));//获取集合里的元素，通过下标
        list.remove(1);//下标
        System.out.println(list);
        System.out.println(list.size());//集合的大小(长度)
        System.out.println(list.contains(3));//true,看一个集合包不包含一个元素
    }
}

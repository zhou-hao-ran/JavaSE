package org.neuedu.chapter15.Demo3;

import java.util.ArrayList;
import java.util.List;

public class Demo3 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        for (Integer num : list) {
            System.out.println(num);
        }
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}

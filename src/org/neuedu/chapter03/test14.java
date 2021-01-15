package org.neuedu.chapter03;

//编写一个程序，找出大于200的最小的质数
public class test14 {
    public static void main(String[] args) {
        int i;
        int j;
        boolean a;
        for (i = 201; true; i++) {
            a = true;
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    a = false;
                    break;
                }
            }
            if (a) {
                System.out.println(i);
                break;
            }
        }
    }
}

package org.neuedu.chapter06;
//输出大于200的最小的质数。
public class demo3 {
    public static int test() {
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
                return i;
            }
        }
    }
    public static void main(String[] args) {
        int b = test();
        System.out.println(b);
    }
}

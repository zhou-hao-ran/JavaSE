package org.neuedu.chapter05;

//输出1-35中的不重复整数
public class demo03 {
    public static void main(String[] args) {
        boolean[] a = new boolean[35];
        for (int i = 0; i < 7; i++) {
            int random = (int) (Math.random() * 35 + 1);
            if (!a[random - 1]) {
                System.out.println(random);
                a[random - 1] = true;
            } else {
                i--;
            }
        }
    }
}

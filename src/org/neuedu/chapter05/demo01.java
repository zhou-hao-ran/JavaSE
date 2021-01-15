package org.neuedu.chapter05;

public class demo01 {
    public static void main(String[] args) {
        int[] a = {1, 9, 2, 8, 3, 7, 4, 6, 5, 0};
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                System.out.println(a[i]);
            }
        }
    }
}

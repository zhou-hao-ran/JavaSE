package org.neuedu.chapter05;

public class demo02 {
    public static void main(String[] args) {
        int[] a = {1, 9, 2, 8, 3, 7, 4, 6, 5, 0};
        int b = a[0];
        int c = a[0];
        for (int i = 0; i < a.length; i++) {
            if (b < a[i]) {
                b = a[i];
            }
            if (c > a[i]) {
                c = a[i];
            }
        }
        System.out.println(b);
        System.out.println(c);
    }
}

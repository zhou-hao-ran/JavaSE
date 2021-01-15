package org.neuedu.chapter05;

//将一个数组中的元素逆序存放。
public class demo04 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int[] b = new int[a.length];
        int j = 0;
        for (int i = (a.length - 1); i >= 0; i--) {
            b[j] = a[i];
            System.out.println(b[j]);
            j++;
        }
    }
}

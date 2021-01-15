package org.neuedu.chapter06;

import java.util.Scanner;

//定义一个一维的int 数组，长度任意,然后将它们按从小到大的顺序输出（使用冒泡排序）。
public class demo4 {
    public static int[] test(int[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int b = 0;
                    b = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = b;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入数组");
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        int[] b = test(a);
        for (int i : b) {
            System.out.print(i + " ");
        }
    }
}

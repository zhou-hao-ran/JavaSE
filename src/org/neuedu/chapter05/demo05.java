package org.neuedu.chapter05;

import java.util.Arrays;

public class demo05 {
    public static void main(String[] args) {
        int[] a = {3, 1, 5, 4, 2};
        //桶排
        int[] newa=new int[a.length];
        for (int i : a) {
            newa[i-1]=1;
        }
        for(int j=0;j<newa.length;j++) {
            if (newa[j] == 1) {
                System.out.println(j+1);
            }
        }

        //快速排序
        //Arrays.sort(a);
        //for (int i : a) {
        //    System.out.println(i);
        //}

        //冒泡排序
        //for (int i = 1; i <= a.length; i++) {
        //    for (int j = 0; j < a.length - i; j++) {
        //        if (a[j] > a[j + 1]) {
        //            int b = a[j];
        //            a[j] = a[j + 1];
        //            a[j + 1] = b;
        //        }
        //    }
        //}
        //for (int num : a) {
        //    System.out.println(num);
        //}

        //选择排序
        //for (int i = 0; i < a.length - 1; i++) {
        //    for (int j = i + 1; j < a.length; j++) {
        //        if (a[i] > a[j]) {
        //            int b = a[i];
        //            a[i] = a[j];
        //            a[j] = b;
        //        }
        //    }
        //}
        //for (int num : a) {
        //    System.out.println(num);
        //}
    }
}

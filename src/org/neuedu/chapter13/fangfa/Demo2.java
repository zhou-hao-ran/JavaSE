package org.neuedu.chapter13.fangfa;

import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) {
        String str1 = "hello";
        System.out.println(str1.charAt(1));//指定索引处的字符
        char[] arr1 = str1.toCharArray();
        System.out.println(Arrays.toString(arr1));//返回字符串的字符数组
        String str2 = "辽宁。湖北。新疆";
        String[] arr2 = str2.split("。");
        System.out.println(Arrays.toString(arr2));//将字符串按照参数分割成一个数组
    }
}

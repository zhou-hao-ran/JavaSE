package org.neuedu.chapter13.fangfa;

public class Demo1 {
    public static void main(String[] args) {
        String arr = "hello";
        System.out.println(arr.length());//字符串长度
        System.out.println(arr.substring(1));//从索引为这个数的那个字符开始到最后
        System.out.println(arr.substring(1, 4));//[1,4)||从索引为前面这个数的那个字符开始到索引为后面那个数的那个字符（前一个）结束[1,4)
        System.out.println(arr.indexOf("l"));//这个字符在字符串中第一次出现位置的索引
        System.out.println(arr.lastIndexOf("l"));//这个字符在字符串中最后一次出现位置的索引
    }
}

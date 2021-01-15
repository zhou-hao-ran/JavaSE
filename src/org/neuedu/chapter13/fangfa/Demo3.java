package org.neuedu.chapter13.fangfa;

public class Demo3 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "Hello";
        System.out.println(str1.equals(str2));//查询俩字符串是否相等(完全一致)
        System.out.println(str1.equalsIgnoreCase(str2));//查询俩字符串是否相等(忽略大小写)
        System.out.println(str1.startsWith("h"));//查询是否以XX开头
        System.out.println(str1.endsWith("o"));//查询是否以XX结尾
        System.out.println(str1.contains("ell"));//查询该字符串是否包含子字符串
        System.out.println(str1.concat(" world"));//拼接字符串
        String str3 = "  hello wrold       ";
        System.out.println(str3.trim());//掐头去尾（空格）
    }
}

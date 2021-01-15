package org.neuedu.chapter03;

import java.util.Scanner;
//由命令行输入一个4位整数，求将该数反转以后的数，如原数为1234，反转后的数位4321。
public class test7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个四位数");
        int a = scanner.nextInt();
        System.out.println(a%10*1000+a/10%10*100+a/100%10*10+a/1000);
    }
}

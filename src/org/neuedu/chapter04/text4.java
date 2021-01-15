package org.neuedu.chapter04;
import java.util.Scanner;
//写出两个整型变量a和b互换值的程序
public class text4 {
    public static void main(String[] args) {
        System.out.println("输入a");
        Scanner scanner1 = new Scanner(System.in);
        int a = scanner1.nextInt();
        System.out.println("输入b");
        Scanner scanner2 = new Scanner(System.in);
        int b = scanner2.nextInt();
        int c;
        c=a;
        a=b;
        b=c;
        System.out.println(a);
        System.out.println(b);
    }
}

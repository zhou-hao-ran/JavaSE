package org.neuedu.chapter06;
import java.util.Scanner;
//判断该年份是平年还是闰年。
public class demo1 {
    public static String test(int a) {
        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
            return "闰年";
        } else {
            return "平年";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份");
        int a = scanner.nextInt();
        String b = test(a);
        System.out.println(b);
    }
}

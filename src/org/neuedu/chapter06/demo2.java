package org.neuedu.chapter06;
import java.util.Scanner;
//求整数n的阶乘，例如5的阶乘是1*2*3*4*5。
public class demo2 {
    public static int test(int a) {
        int sum = 1;
        for (int i = 1; i <= a; i++) {
            sum = sum * i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入整数");
        int a = scanner.nextInt();
        int b = test(a);
        System.out.println(b);
    }
}

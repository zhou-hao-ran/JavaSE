package org.neuedu.chapter03;

import java.util.Scanner;
//判断一个数字是否能被5和6同时整除（打印能被5和6整除），或只能被5整除（打印能被5整除）
// ，或只能被6整除，（打印能被6整除），不能被5或6整除，（打印不能被5或6整除）
public class test6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入");
        int a = scanner.nextInt();
             if(a%5==0 && a%6==0){
            System.out.println("能被5和6整除");
        }
        if(a%5==0 && a%6!=0){
            System.out.println("只能被5整除");
        }
        if(a%5!=0 && a%6==0){
            System.out.println("只能被6整除");
        }
        if(a%5!=0 && a%6!=0){
            System.out.println("不能被5或6整除");
        }
    }
}

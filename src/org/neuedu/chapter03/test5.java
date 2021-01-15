package org.neuedu.chapter03;

import java.util.Scanner;
//编写程序， 判断一个变量x的值，如果是1，输出x=1，
// 如果是5，输出x=5，如果是 10，输出x=10，除了以上几个值，都输出x=none。
public class test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入");
        int x = scanner.nextInt();
        switch(x){
            case 1:
            case 5:
            case 10:
                System.out.println("x="+x);
                break;
            default:
                System.out.println("x=none");
        }

        //if(x==1){
        //    System.out.println("x=1");
        //}
        //if(x==5){
        //    System.out.println("x=5");
        //}
        //if(x==10){
        //    System.out.println("x=10");
        //}
        //else{
        //    System.out.println("x=none");
        //}
    }
}

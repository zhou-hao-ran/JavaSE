package org.neuedu.chapter03;

import java.util.Scanner;
//输入三个整数x,y,z，请把这三个数由小到大输出。
public class test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入整数x，y，z");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        if(x>y){
            if(y>z){
                System.out.println("z,y,x");
            }else if(x>z){
                System.out.println("y,z,x");
            }else{
                System.out.println("y,x,z");
            }
        }else{
            if(y<z){
                System.out.println("x,y,z");
            }else if(x<z) {
                System.out.println("x,z,y");
            }else{
                System.out.println("z,x,y");
            }
        }
    }
}

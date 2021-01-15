package org.neuedu.chapter03;

import java.util.Scanner;
//企业发放的奖金根据利润提成。利润低于或等于10万元时，奖金可提10%；
// 利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可提成7.5%；
// 20万到40万之间时，高于20万元的部分，可提成5%；40万到60万之间时高于40万元的部分，可提成3%；
// 60万到100万之间时，高于60万元的部分，可提成1.5%，高于100万元时，超过100万元的部分按1%提成，
// 在程序中设定一个变量为当月利润，求应发放奖金总数？
public class test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入");
        int a = scanner.nextInt();
        if(a<=100000){
            System.out.println("奖金为"+a*10/100);
        }
        if(a>100000 && a<=200000){
            System.out.println("奖金为"+((a-100000)*7.5/100+10000));
        }
        if(a>200000 && a<=400000){
            System.out.println("奖金为"+((a-200000)*5/100+17500));
        }
    }
}

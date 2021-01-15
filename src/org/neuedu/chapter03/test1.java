package org.neuedu.chapter03;
//输入一个年份，判断这个年份是否是闰年。
        public class test1 {
    public static void main(String[] args) {
        int a=1999;
        if(a%4==0&&a%100!=0||a%400==0){
            System.out.println("它是闰年");
        }else{
            System.out.println("它是平年");
        }
    }
}

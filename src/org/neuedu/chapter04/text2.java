package org.neuedu.chapter04;
//给定一个1-365之间的值，判断是2020年的几月几日
public class text2 {
    public static void main(String[] args) {
        int[] a = {31,29,31,30,31,30,31,31,30,31,30,31};
        int b=0;
        int c=0;
        int d=234;
        int e=2020;
        if (e%4==0 && e%100!=0 || e%400==0){
            a[1]=29;
        }else{
            a[1]=28;
        }
        for(int i=1;i<=a.length;i++){
            b=b+a[i];
            if(b>d){
                b=d+a[i]-b;
                c=i;
                break;
            }
        }
        System.out.println(c+"月"+b+"日");
    }
}

package org.neuedu.chapter02;

public class Demo01 {
    public static void main(String[] args){
        byte num1=100;//1字节：-2^7__2^7-1;2^8;1byte=8bit=8位2进制数
        short num2=200;//2字节 -2^15__2^15-1;2^16
        int num3=300;//4字节 -2^31__2^31-1;2^32
        long num4=40000000000L;//8字节 -2^63__2^63-1;2^64

        double num5=9.9;
        float num6=9.9F;

        char num7='A';
        char num8='\u30AF';//unicode码
        System.out.println(num8);

        boolean b1=true;
        boolean b2=false;

        int num11=0b0101;//2进制：0b
        int num12=024;//8进制：0
        int num13=0x24;//16进制:0x

        int x=0;
        x=x++;//把右边的x赋值给左边的x，右边的x++,右边的x作为临时栈被删除，最后输出的x=0
        System.out.println(x);
        x++;//x在当前行后++,最后输出的x=1
        System.out.println(x);
        int y=0;
        y=++y;//右边的y++,把右边的y赋值给左边的y，右边的y作为临时栈被删除，最后输出的x=1
        System.out.println(y);
        y++;//y在当前行先++,最后输出的y=1
        System.out.println(y);

        int year=2000;
        if (year%4==0 && year%100!=0 || year%400==0 )//&&:与的优先级大于||:或
            System.out.println("闰年");
        else
            System.out.println("不是闰年");
    }
}

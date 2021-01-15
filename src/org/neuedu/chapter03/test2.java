package org.neuedu.chapter03;
//给定一个成绩a，使用switch结构求出a的等级。A：90-100，B：80-89，C：70-79，D：60-69，E：0~59。
public class test2 {
    public static void main(String[] args) {
        int a=98;
        if(a>=90 && a<=100)
            System.out.println("A");
        if(a>=80 && a<=89)
            System.out.println("B");
        if(a>=70 && a<=79)
            System.out.println("C");
        if(a>=60 && a<=69)
            System.out.println("D");
        if(a>=0 && a<=59)
            System.out.println("E");
    }
}

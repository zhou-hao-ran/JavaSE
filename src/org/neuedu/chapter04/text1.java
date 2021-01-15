package org.neuedu.chapter04;
//一小球从100米自由下落，每次返回一半，再落下，球第十次落地时，共经历多少米？第十次的反弹高度是多少？
public class text1 {
    public static void main(String[] args) {
        double a=100;
        double b=100;
        for(int i=1;i<=10;i++){
            a=a/2;
            b=b+a*2;
        }
        System.out.println(a);
        System.out.println(b);
    }
}

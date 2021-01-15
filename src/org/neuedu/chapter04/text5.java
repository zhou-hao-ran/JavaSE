package org.neuedu.chapter04;
//求100以内奇数和
public class text5 {
    public static void main(String[] args) {
        int a=0;
        for (int i=1;i<=100;i++){
            if(i%2==1){
                a=a+i;
            }
        }
        System.out.println(a);
    }
}

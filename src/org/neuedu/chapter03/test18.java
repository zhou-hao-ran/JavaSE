package org.neuedu.chapter03;

public class test18 {
    public static void main(String[] args) {
        int i=0;
        for(int a=1;a<=4;a++){
            for(int b=1;b<=4;b++){
                for(int c=1;c<=4;c++){
                    if(a!=b && b!=c){
                        System.out.println(a+""+b+c);
                        i++;
                    }
                }
            }
        }
        System.out.println(i);
    }
}

package org.neuedu.chapter03;
//分别使用for循环，while循环，do循环求1到100之间所有能被3整除的整数的和。
public class test13 {
    public static void main(String[] args) {
        int i;
        int j=0;
        for(i=1;i<=100;i++){
            if(i%3==0){
               j=j+i;
            }
        }
        System.out.println(j);
    }
}

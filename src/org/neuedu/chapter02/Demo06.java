package org.neuedu.chapter02;

public class Demo06 {
    public static void main(String[] args) {
        //int i;
        //int j;
        //for (i=1;i<=4;i++){
        //    for(j=1;j<=i;j++){
        //        System.out.print("*");
        //    }
        //    System.out.println();
        //}
        int i;
        int j;
        int k;
        for (i=1;i<=4;i++){
            for(j=1;j<=4-i;j++){
                System.out.print(" ");
            }
            for(k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

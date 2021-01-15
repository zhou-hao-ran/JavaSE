package org.neuedu.chapter03;

//输出0-9之间的数，但是不包括5。
public class test8 {
    public static void main(String[] args) {
        //int i=0;
        //while(i<=9){
        //    if(i!=5) {
        //        System.out.println(i);
        //    }
        //    i++;
        //}

        //int i=0;
        //do{
        //    if(i!=5)
        //    System.out.println(i);
        //    i++;
        //}while(i<=9);

        int i;
        for (i=0;i<=9;i++){
            if (i != 5) {
                System.out.println(i);
            }
        }
    }
}

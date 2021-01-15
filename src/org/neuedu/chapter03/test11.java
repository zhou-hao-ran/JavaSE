package org.neuedu.chapter03;

public class test11 {
    public static void main(String[] args) {
        int i=1;
        int j=0;
        //while(j<=6000){
        //    j=j+i;
        //    i++;
        //}

        //while(true){
        //    j=j+i;
        //    if(j>6000){
        //        break;
        //    }
        //    i++;
        //}
        //System.out.println(j);

        //do{
        //    j=j+i;
        //    if(j>6000){
        //        break;
        //    }
        //    i++;
        //}while(true);
        //System.out.println(j);

        for(i=1;true;i++){
            j=j+i;
            if(j>6000){
                break;
            }
        }
        System.out.println(j);
    }
}

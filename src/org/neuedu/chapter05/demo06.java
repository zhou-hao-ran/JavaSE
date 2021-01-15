package org.neuedu.chapter05;
//将一个数组中的重复元素保留一个其他的清零。
public class demo06 {
    public static void main(String[] args) {
        int[] a={1,3,5,7,9,9,5,3};
        //for(int i=1;i<=a.length-1;i++){
        //    for(int j=i+1;j<a.length;j++){
        //        if(a[i]==a[j]){
        //            a[j]=0;
        //        }
        //    }
        //}
        //for (int i : a) {
        //    System.out.println(i);
        //}
            for(int i=1;i<=a.length;i++){
                for(int j=0;j<a.length-1;j++){
                    if(a[j]==a[j+1]){
                        a[j+1]=0;
                    }
                    if(a[j]!=a[j+1]){
                        int b=a[j];
                        a[j]=a[j+1];
                        a[j+1]=b;
                    }
                }
            }
            for (int i : a) {
                System.out.println(i);
            }


    }
}

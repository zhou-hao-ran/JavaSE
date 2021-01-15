package org.neuedu.chapter03;
//假设某员工今年的年薪是30000元，年薪的年增长率6%。
// 编写一个Java应用程序计算该员工10年后的年薪，并统计未来10年（从今年算起）总收入。
public class test10 {
    public static void main(String[] args) {
        //int i=1;
        //int j=30000;
        //int k=0;
        //while(i<=10){
        //    k=k+j;
        //    j=j+j*6/100;
        //    i++;
        //}
        //System.out.println(j);
        //System.out.println(k);

        //int i=1;
        //int j=30000;
        //int k=0;
        //do{
        //    k=k+j;
        //    j=j+j*6/100;
        //    i++;
        //}while(i<=10);
        //System.out.println(j);
        //System.out.println(k);

        int i=1;
        int j=30000;
        int k=0;
        for(i=1;i<=10;i++){
            k=k+j;
            j=j+j*6/100;
        }
        System.out.println(j);
        System.out.println(k);
    }
}

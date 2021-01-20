package org.neuedu.chapter13.fangfa;

//String str = "11,abc,3,4,5,zz,71,8,A,10,11";
//写出程序，请将其中所有的数字取出来求和
public class Demo6 {
    public static void main(String[] args) {
        String str = "11,abc,3,4,5,zz,71,8,A,10,11";
        String[] arr = str.split("\\D+");
        int b = 0;
        for (String s : arr) {
            if (!s.equals("")) {
                b = b + Integer.parseInt(s);
            }
        }
        System.out.println(b);
    }
}

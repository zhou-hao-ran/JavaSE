package org.neuedu.chapter14;

//1,2,2,3,4,5.打印这6个数，组成的所有6位数字
//4不能是百位
//3，5不能相邻
public class Test4 {
    public static boolean getNum(int num) {
        String str = num + "";
        String[] arr = {"1", "2", "3", "4", "5"};
        for (String s : arr) {
            if (!str.contains(s)) {
                return false;
            }
        }
        if (str.indexOf('2') == str.lastIndexOf('2')) {
            return false;
        }
        if (str.charAt(3) == '4') {
            return false;
        }
        if (str.contains("35") || str.contains("53")) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        for (int i = 122345; i <= 543221; i++) {
            if (getNum(i)) {
                System.out.println(i);
            }
        }
    }
}

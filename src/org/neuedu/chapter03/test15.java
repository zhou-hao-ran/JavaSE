package org.neuedu.chapter03;

public class test15 {
    public static void main(String[] args) {
        int m = 8;
        int n = 12;
        int result = 1;
        for (int i = 1; i <= m; i++) {
            if ((m % i == 0) && (n % i == 0)) {
                result = i;
            }
        }
        System.out.println(result);
    }
}

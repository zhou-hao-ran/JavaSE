package org.neuedu.chapter14;

public class Test2 {
    public int getCount(String str) {
        char[] arr = str.toCharArray();
        int i = 0;
        for (char c : arr) {
            if (c == 'e') {
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        Test2 a = new Test2();
        int b = a.getCount("daweqwrfeqdqwerweqwfqefqedw");
        System.out.println(b);
    }
}

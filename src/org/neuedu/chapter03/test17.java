package org.neuedu.chapter03;

//母鸡3元/只，公鸡4元/只，小鸡0.5元/只，如果花100元钱买100只鸡，每一种鸡可以买0只，请问有哪些可能？
public class test17 {
    public static void main(String[] args) {
        int a;
        int b;
        int c = 0;
        int i = 0;
        for (a = 0; a <= 100; a++) {
            for (b = 0; b <= 100; b++) {
                c = 100 - a - b;
                if (3 * a + 4 * b + 0.5 * c == 100) {
                    System.out.println("母鸡数:" + a + "公鸡数:" + b + "小鸡数:" + c);
                    i++;
                }
            }
        }
        System.out.println(i);
    }
}

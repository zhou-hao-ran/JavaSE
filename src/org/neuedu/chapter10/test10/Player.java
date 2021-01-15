package org.neuedu.chapter10.test10;

public class Player {
    private static int s = 0;

    private Player() {
        s++;
    }

    private static Player a() {
        if (s >= 11) {
            System.out.println("已经输出11个数了");
            return null;
        }
        System.out.println("输出第" + (s + 1) + "个数");
        Player player = new Player();
        return player;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            Player.a();
        }
    }
}

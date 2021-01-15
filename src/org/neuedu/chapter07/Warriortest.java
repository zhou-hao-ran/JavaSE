package org.neuedu.chapter07;

public class Warriortest {
    public static void main(String[] args) throws InterruptedException {
        Warrior w1=new Warrior("盖伦");
        Warrior w2=new Warrior("赵信");
        w1.levelUp(3000);
        w2.levelUp(2000);
        Thread.sleep(1000);
        while (true){
            double random=Math.random();
            if (random<0.5){
                w1.attack(w2);
            }else {
                w2.attack(w1);
            }
            if (w1.getHp()==0 || w2.getHp()==0){
                break;
            }
        }
    }
}

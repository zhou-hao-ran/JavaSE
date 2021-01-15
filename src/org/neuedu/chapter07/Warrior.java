package org.neuedu.chapter07;

public class Warrior {
    String name;
    int level;
    int hp;
    int dps;
    int defend;

    public Warrior(String name) {
        this.name = name;
        this.level = 1;
        this.hp = 100;
        this.dps = 10;
        this.defend = 5;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDps() {
        return dps;
    }

    public void setDps(int dps) {
        this.dps = dps;
    }

    public int getDefend() {
        return defend;
    }

    public void setDefend(int defend) {
        this.defend = defend;
    }

    public void levelUp(int money){
        this.level=(int)(level+money/1000);
        this.hp=hp+(level-1)*10;
        this.dps=dps+(level-1)*4;
        this.defend=defend+(level-1)*2;
        System.out.println(name+"升级了，能力提升");
    }

    public void attack(Warrior w) {
        if (hp == 0) {
            System.out.println(name + "已经阵亡");
        } else {
            if (w.getHp() == 0) {
                System.out.println(w.getName() + "已经阵亡");
            } else {
                int demage = dps - w.getDefend() <= 0 ? 1 : dps - w.getDefend();
                int resthp = w.getHp() - demage;
                if (resthp <= 0) {
                    w.setHp(0);
                    System.out.println(w.getName() + "已经阵亡");
                    return;
                } else {
                    w.setHp(resthp);
                    System.out.println(name + "对" + w.getName() + "造成了" + demage + "点伤害，" + w.getName() + "还剩" + resthp + "点血量");
                }
            }
        }
    }
}

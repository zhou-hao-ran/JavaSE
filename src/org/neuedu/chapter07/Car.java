package org.neuedu.chapter07;

public class Car {
    String yanse;
    String pinpai;
    int jiage;

    public Car() {
    }

    public Car(String yanse, String pinpai, int jiage) {
        this.yanse = yanse;
        this.pinpai = pinpai;
        this.jiage = jiage;
        System.out.println(yanse);
        System.out.println(pinpai);
        System.out.println(jiage);
    }

    public void setYanse(String yanse) {
        this.yanse = yanse;
        System.out.println(yanse);
    }

    public void setPinpai(String pinpai) {
        this.pinpai = pinpai;
        System.out.println(pinpai);
    }

    public void setJiage(int jiage) {
        this.jiage = jiage;
        System.out.println(jiage);
    }
}

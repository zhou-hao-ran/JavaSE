package org.neuedu.chapter09;

public class Parking {
    public void getmoney(Car car,int time){
        int money=car.paymoney(time);
        System.out.println(money);
    }
}

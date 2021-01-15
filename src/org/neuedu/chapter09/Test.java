package org.neuedu.chapter09;

public class Test {
    public static void main(String[] args) {
        Parking parking=new Parking();
        Keche keche=new Keche();
        Huoche huoche=new Huoche();
        Jiaoche jiaoche=new Jiaoche();

        parking.getmoney(keche,3);
        parking.getmoney(huoche,2);
        parking.getmoney(jiaoche,1);
    }
}

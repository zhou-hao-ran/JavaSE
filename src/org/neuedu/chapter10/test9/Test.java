package org.neuedu.chapter10.test9;

public class Test {
    public static void main(String[] args) {
        Singleton s1=Singleton.getS();
        Singleton s2=Singleton.getS();
        System.out.println(s1==s2);
    }
}

package org.neuedu.chapter10.test9;

public class Singleton {
    //饿汉模式
    //private static Singleton s=new Singleton();
    //private Singleton(){
    //}
    //public static Singleton getS() {
    //    return s;
    //}
    //懒汉模式（慢加载）
    private static Singleton s;
    private Singleton(){
    }
    public static Singleton getS(){
        if (s==null){
            s=new Singleton();
        }
        return s;
    }
}

package org.neuedu.chapter12;

public class Test {
    public static void main(String[] args) {
        News sports=new Sports();
        News yule=new Yule();
        News zhenzhi=new Zhenzhi();

        sports.publishNews();
        yule.publishNews();
        zhenzhi.publishNews();
    }
}

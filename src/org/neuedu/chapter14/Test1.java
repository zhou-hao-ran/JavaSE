package org.neuedu.chapter14;

public class Test1 {
    public void check(String str) {
        if (str.indexOf("@") == -1 || str.indexOf(".") == -1) {
            System.out.println("必须包含@和.");
        } else if (str.indexOf("@") != str.lastIndexOf("@") || str.indexOf(".") != str.lastIndexOf(".")) {
            System.out.println("只能包含一个@和.");
        } else if (str.indexOf("@") > str.indexOf(".")) {
            System.out.println("@必须在.前面");
        } else {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        Test1 a = new Test1();
        a.check("zhrzuishuai@qq.com");
    }
}

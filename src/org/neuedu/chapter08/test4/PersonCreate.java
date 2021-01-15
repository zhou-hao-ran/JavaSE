package org.neuedu.chapter08.test4;
public class PersonCreate {
    public static void main(String[] args) {
        Person p1 = new Person("zhangsan",33,1.73);
        Person p2 = new Person("lishi",44,1.74);
        p1.sayHello();
        p2.sayHello();
    }
}

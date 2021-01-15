package org.neuedu.chapter13.yichang;

public class Test {
    public static void main(String[] args) {
        Service service=new Service();
        Person person=service.find("bob");
        System.out.println(person.getName()+","+person.getAge());
    }
}

package org.neuedu.chapter13.yichang;

public class Service {
    public Person find(String name) {
        Person p1=new Person("tom",1);
        Person p2=new Person("bob",2);
        Person p3=new Person("lucy",3);
        Person p4=new Person("allen",4);
        Person p5=new Person("ella",5);
        Person[] person={p1,p2,p3,p4,p5};
        for (Person i : person) {
            if (i.getName()==name){
                return i;
            }
        }
        try {
            throw new UseNotFoundException();
        } catch (UseNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}

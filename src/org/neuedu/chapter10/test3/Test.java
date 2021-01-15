package org.neuedu.chapter10.test3;

public class Test {
    public static void main(String[] args) {
        Service service=new Service();
        User user=service.findUser("allen");
        System.out.println(user.getName()+","+user.getPassword());
    }
}

package org.neuedu.chapter15.Demo9;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Service service = new Service();
        User user = service.getUserByStuno(1001);
        System.out.println(user);

        List<User> users = service.getUserByName("tom");
        System.out.println(users);
    }
}
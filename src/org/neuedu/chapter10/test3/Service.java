package org.neuedu.chapter10.test3;

public class Service {
    public User findUser(String name){
        MapperInter mapper=new Mapper();
        User user=mapper.showInfo(name);
        if (user!=null){
            user.setPassword("6666");
        }
        return user;
    }
}

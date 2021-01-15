package org.neuedu.chapter15.Demo9;

import java.util.List;

public class Service {
    public User getUserByStuno(int stuno) {
        Mapper mapper = new MapperImpl();
        return mapper.findUserByStuno(stuno);
    }

    public List<User> getUserByName(String name) {
        Mapper mapper = new MapperImpl();
        return mapper.findUserByName(name);
    }
}

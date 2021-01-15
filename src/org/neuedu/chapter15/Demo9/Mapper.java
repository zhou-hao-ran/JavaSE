package org.neuedu.chapter15.Demo9;

import java.util.List;

public interface Mapper {
    User findUserByStuno(int stuno);
    List<User> findUserByName(String name);
}
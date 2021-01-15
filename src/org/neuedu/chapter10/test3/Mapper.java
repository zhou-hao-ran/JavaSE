package org.neuedu.chapter10.test3;

public class Mapper implements MapperInter{
    @Override
    public User showInfo(String name) {
        User u1=new User("tom","1231");
        User u2=new User("bob","1232");
        User u3=new User("lucy","1234");
        User u4=new User("allen","1235");
        User u5=new User("ella","1236");
        User[] users={u1,u2,u3,u4,u5};
        for (User user : users) {
            if (user.getName()==name){
                return user;
            }
        }
        return null;
    }
}

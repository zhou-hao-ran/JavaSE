package org.neuedu.sjkff.Demo2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class UserService {
    public User userLogin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String username = scanner.nextLine();
        System.out.println("请输入用户密码:");
        String password = scanner.nextLine();
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        UserMapper userMapper = new UserMapperImpl();
        return userMapper.userLogin(user);
    }

    public int signIn() {
        if (Test.user != null) {
            UserMapper userMapper = new UserMapperImpl();
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            int counts = userMapper.findSignInfoByIdAndDate(Test.user.getId(), sdf.format(date));
            if (counts != 0) {
                return 500;
            } else {
                userMapper.insertSignInfo(Test.user.getId(), date);
                return 200;
            }
        }else {
            return -1;
        }
    }
    public int signOut(){
        if (Test.user != null) {
            UserMapper userMapper = new UserMapperImpl();
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            int counts = userMapper.findSignInfoByIdAndDate(Test.user.getId(), sdf.format(date));
            if (counts != 0) {
                userMapper.updateSignInfo(Test.user.getId(), date);
                return 200;
            } else {
                return 500;
            }
        }else {
            return -1;
        }
    }
    public void showSignInfo() {
        if (Test.user!=null){
            UserMapper userMapper = new UserMapperImpl();
            List<SignInfo> signInfoByUid=userMapper.getSignInfoByUid(Test.user.getId());
            for (SignInfo signInfo : signInfoByUid) {
                System.out.println(signInfo);
            }
        }else {
            System.out.println("未登录");
        }

    }
}

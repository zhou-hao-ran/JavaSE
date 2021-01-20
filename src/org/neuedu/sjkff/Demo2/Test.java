package org.neuedu.sjkff.Demo2;

import java.util.List;
import java.util.Scanner;

public class Test {
    public static User user = null;
    public static List<SignInfo> signInfo=null;
    public static void main(String[] args) {
        UserService service = new UserService();
        while (true) {
            System.out.println("欢迎使用java20签到系统");
            System.out.println("----------------------");
            System.out.println("1：用户登录");
            System.out.println("2：用户签到");
            System.out.println("3：用户签退");
            System.out.println("4：查看个人信息");
            System.out.println("5：查看个人签到记录");
            System.out.println("6: 修改个人密码");
            System.out.println("7：退出");
            System.out.println("----------------------");
            Scanner scanner = new Scanner(System.in);
            System.out.println("请选择：");
            String option = scanner.nextLine();
            switch (option) {
                case "1":
                    User user = service.userLogin();
                    if (user == null) {
                        System.out.println("用户名或密码错误");
                    } else {
                        System.out.println("登陆成功");
                        Test.user = user;
                    }
                    break;
                case "2":
                    int num = service.signIn();
                    if (num == -1) {
                        System.out.println("用户未登录");
                    } else if (num == 500) {
                        System.out.println("今天已经签到了");
                    } else {
                        System.out.println("签到成功");
                    }
                    break;
                case "3":
                    int num1 = service.signOut();
                    if (num1 == -1) {
                        System.out.println("用户未登录");
                    } else if (num1 == 500) {
                        System.out.println("今天没有签到");
                    } else {
                        System.out.println("签退成功");
                    }
                    break;
                case "4":
                    if (Test.user != null) {
                        System.out.println(Test.user);
                    } else {
                        System.out.println("没有登陆");
                    }
                    break;
                case "5":
                    service.showSignInfo();
                    break;
                case "6":
                    System.out.println("修改个人信息");
                    break;
                case "7":
                    if (Test.user != null) {
                        Test.user = null;
                        System.out.println("用户已退出");
                    } else {
                        System.out.println("没有登录");
                    }
                    break;
                default:
                    System.out.println("请重新选择");
            }
        }
    }
}

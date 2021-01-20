package org.neuedu.chapter13.fangfa;

import java.util.Calendar;
import java.util.Date;

public class Demo5 {
        public static void main(String[] args) {
            Date d = new Date();
            System.out.println(d);
            // Calendar 是抽象类，不能直接创建对象
            Calendar calendar = Calendar.getInstance();
            Date date = calendar.getTime();
            System.out.println(date);
            System.out.println(date.getTime());
            System.out.println(calendar.getTime().getTime());
        }

}

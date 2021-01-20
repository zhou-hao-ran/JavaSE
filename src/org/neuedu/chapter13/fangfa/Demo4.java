package org.neuedu.chapter13.fangfa;

import java.util.Date;

public class Demo4 {
        public static void main(String[] args) {
            Date date = new Date();
            System.out.println(date);
            // 时间戳 -- 1970-01-01 00：00：00 - 现在 经过的 毫秒数
            long time = date.getTime();
            System.out.println(time);

            Date date1 = new Date(1610504484384L);
            System.out.println(date1);
            // 过时方法
            System.out.println(date1.toLocaleString());
        }
}

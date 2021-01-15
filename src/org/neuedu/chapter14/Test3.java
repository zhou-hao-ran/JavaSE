package org.neuedu.chapter14;

public class Test3 {
    public int getCount(String parent, String child) {
        int count = 0;
        int index = parent.indexOf(child);
        while (index != -1) {
            count++;
            parent = parent.substring(index + child.length());
            index = parent.indexOf(child);
        }
        return count;
    }


    public static void main(String[] args) {
        Test3 a = new Test3();
        int count = a.getCount("有一个字符串，其中包含中文字符、英文字符和数字字符，请统计和打印出各个字符的个数。", "字符");
        System.out.println(count);
    }
}

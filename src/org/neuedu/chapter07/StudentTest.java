package org.neuedu.chapter07;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "周浩然";
        s1.age = 21;
        s1.gender = true;
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.gender);

        Student s2 = new Student("周浩然", 21, true);
        s2.name = "浩然周";
        s2.setAge(22);
        //setter 访问
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.gender);

        System.out.println(s1.name);
        String name = s1.getName();
        System.out.println(name);
        //getter 访问
    }
}

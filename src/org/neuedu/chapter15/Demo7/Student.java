package org.neuedu.chapter15.Demo7;

import java.util.Comparator;

public class Student implements Comparator<Student> {
    private String name;
    private int age;

    /**
     *
     * @param o1
     * @param o2
     * @return 正数=o1>o2，负数=o1>o2，0=o1=o2。
     */
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge()-o2.getAge();
    }

    @Override
    public String toString() {
        return "Student{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

package org.neuedu.chapter08.test3;
public class Person {
    String name;
    int height;
    int weight;
    public Person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void sayHello() {
        System.out.println("hello,my name is "+getName());
    }
    public static void main(String[] args) {
        Person p1 = new Person("zhr",180,160);
        p1.sayHello();
    }
}

package org.neuedu.chapter11;
//定义一个汽车类Vehicle，属性包括：汽车品牌brand（String类型）、
// 颜色color（String类型）和速度speed（double类型）。
// 至少提供一个有参的构造方法（要求品牌和颜色可以初始化为任意值，但速度的初始值必须为0）。
// 为属性提供访问器方法。注意：汽车品牌一旦初始化之后不能修改
// 定义一个一般方法run()，用打印语句描述汽车奔跑的功能。
public class Vehicle {
    String brand;
    String color;
    double speed;

    public Vehicle(String brand, String color, double speed) {
        this.brand = brand;
        this.color = color;
        this.speed = 0;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}

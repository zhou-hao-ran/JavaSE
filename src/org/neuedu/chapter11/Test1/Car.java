package org.neuedu.chapter11.Test1;
//定义一个Vehicle类的子类轿车类Car，要求如下：
//轿车有自己的属性载人数loader（int 类型）。
//提供该类初始化属性的构造方法。
//重新定义run()，用打印语句描述轿车奔跑的功能。
public class Car extends Vehicle{
    int loader;

    public Car(String brand, String color, double speed, int loader) {
        super(brand, color, speed);
        this.loader = loader;
    }
}

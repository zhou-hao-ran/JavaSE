package org.neuedu.chapter10.test4;

public class Changfangti extends Juxing{
    double height;

    public Changfangti(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }
    public double findVolume(){
        return length*width*height;
    }
}

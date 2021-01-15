package org.neuedu.chapter10.test1;

public class Employee extends Person {
    double age;
    double sal;
    int upsal;
    public void show() {
        System.out.println("Employee,"+name);
    }
    public double addSal() {
        if(age>1){
            sal=sal+sal*0.1;
        }
        return sal;
    }
    public double addSal(double upsal) {
        if (age>1){
            if (upsal>sal*0.5){
                sal=sal+sal*0.5;
            }
            else{
                sal=sal+upsal;
            }
        }
        return sal;
    }
}

package org.neuedu.chapter08.test1;
public class notebook {
    char color;
    int cpu;
    public notebook() {
    }
    public notebook(char color, int cpu) {
        this.color = color;
        this.cpu = cpu;
    }
    public void sc() {
        System.out.println(color + "," + cpu);
    }
}

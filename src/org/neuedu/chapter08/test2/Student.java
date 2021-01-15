package org.neuedu.chapter08.test2;
public class Student {
    String name;
    int sno;
    int grade;
    public Student(String name, int sno, int grade) {
        this.name = name;
        this.sno = sno;
        this.grade = grade;
    }
    public static void main(String[] args) {
        Student s1 = new Student("a", 3, 60);
        Student s2 = new Student("b", 7, 80);
        Student s3 = new Student("c", 5, 40);
        Student[] a = {s1, s2, s3};
        for (Student student : a) {
            System.out.println(student.getName() + "," + student.getSno() + "," + student.getGrade());
        }
    }
    public void sc(Student[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < a.length - i; j++) {
                if (a[j].getGrade() < a[j + 1].getGrade()) {
                    Student temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSno() {
        return sno;
    }
    public void setSno(int sno) {
        this.sno = sno;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
}

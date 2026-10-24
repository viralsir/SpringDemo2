package org.arham.springdemo2;

public class Student
{
    int rollno;
    String name;
    int maths;

    public Student() {
    }

    public Student(int rollno, String name, int maths) {
        this.rollno = rollno;
        this.name = name;
        this.maths = maths;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }
}

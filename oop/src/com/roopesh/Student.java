package com.roopesh;

public class Student extends Human {
    float percent10th;
    float percent12th;
    String course;

    public Student() {
        this.percent10th = 100;
        this.percent12th = 100;
        this.course = "CSE";
    }

    public Student(String name, String gender, String race, int age, float percent10th, float percent12th, String course) {
        super(name, gender, race, age);
        this.percent10th = percent10th;
        this.percent12th = percent12th;
        this.course = course;
    }
}

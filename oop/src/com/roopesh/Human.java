package com.roopesh;

public class Human {
    String name;
    String gender;
    String race;
    int age;

    public Human() {
        this.name = "default";
        this.gender = "default";
        this.race = "default";
        this.age = 0;
    }

    public Human(String name, String gender, String race, int age) {
        this.name = name;
        this.gender = gender;
        this.race = race;
        this.age = age;
    }
}

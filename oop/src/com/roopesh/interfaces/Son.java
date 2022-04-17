package com.roopesh.interfaces;

public class Son implements Father, Mother{

    @Override
    public <String> void fatherName(name) {
        System.out.println(name);
    }

    @Override
    public void fatherAge(age) {
        System.out.println(age);
    }

    @Override
    public void motherName(name) {
        System.out.println(name);
    }

    @Override
    public void motherAge(age) {
        System.out.println(age);
    }
}

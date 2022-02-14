package com.roopesh;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        System.out.print("Enter temperature in celsius = ");
        Scanner input = new Scanner(System.in);
        double temperatureInCelsius = input.nextDouble();
        double temperatureInFahrenheit = (temperatureInCelsius * 9/5) + 32;
        System.out.println(temperatureInFahrenheit);
    }
}

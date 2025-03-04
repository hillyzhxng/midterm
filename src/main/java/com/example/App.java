package com.example;

import java.util.Scanner;

public class App 
{
   public static void main(String[] args) 
   {
    
    //git modify
    System.out.println("changes to git");

    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome to the Temperature Converter!");

    // Get input temperature from the user
    System.out.print("Enter temperature: ");
    double inputTemperature = scanner.nextDouble();

    // Ask the user for the target unit
    System.out.print("Convert to (F for Fahrenheit, C for Celsius): ");
    char targetUnit = scanner.next().toUpperCase().charAt(0);

    // Perform the appropriate conversion
    if (targetUnit == 'F') {
        double fahrenheit = TemperatureConverter.celsiusToFahrenheit(inputTemperature);
        System.out.printf("%.2f°C is %.2f°F%n", inputTemperature, fahrenheit);
    } else if (targetUnit == 'C') {
        double celsius = TemperatureConverter.fahrenheitToCelsius(inputTemperature);
        System.out.printf("%.2f°F is %.2f°C%n", inputTemperature, celsius);
    } else {
        System.out.println("Invalid input! Please enter 'F' or 'C'.");
    }

    scanner.close();
    System.out.println("Thank you for using the Temperature Converter!");
    }
}

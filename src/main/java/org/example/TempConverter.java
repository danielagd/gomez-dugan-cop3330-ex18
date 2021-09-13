package org.example;
import java.util.Scanner;

/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 *Copyright 2021 Daniela Gomez-Dugan
 */
public class TempConverter
{
    public static void main( String[] args )
    {
        // Program to convert from celsius to fahrenheit or vice versa
        Scanner choice_input = new Scanner(System.in);
        Scanner temp_input = new Scanner(System.in);

        System.out.print("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit\nYour choice: ");
        String choice = choice_input.nextLine();

        choice = choice.toUpperCase();

        // Chooses which function to pursue
        if (choice.equals("C"))
            convertToCelsius();
        else
            convertToFahrenheit();
    }

    // Program to convert Celsius to Fahrenheit
    public static void convertToFahrenheit()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the temperature in Celsius: ");
        double temp = input.nextDouble();

        temp = (temp * 9 / 5) + 32;

        System.out.printf("The temperature in Fahrenheit is %.2f", temp);
    }

    // Program to convert Fahrenheit to Celsius
    public static void convertToCelsius()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the temperature in Fahrenheit: ");
        double temp = input.nextDouble();

        temp = (temp - 32) * 5 / 9;

        System.out.printf("The temperature in Celsius is %.2f", temp);
    }
}

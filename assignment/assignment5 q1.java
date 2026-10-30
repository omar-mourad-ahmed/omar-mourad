/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment4;

import java.util.Scanner;

/**
 *
 * @author Ahmed Sabry
 */
public class question1 {
    
public static double getDouble(Scanner s, String prompt) {
        System.out.print(prompt);
        return s.nextDouble();
    }

    public static double celsiusToFahrenheit(double c) {
        return c * 9.0 / 5.0 + 32;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);

        double celsius = getDouble(input, "Enter temperature in Celsius: ");
        double fahrenheit = celsiusToFahrenheit(celsius);

        System.out.printf("Fahrenheit: %.2f%n", fahrenheit);
        input.close();
    }
}
    

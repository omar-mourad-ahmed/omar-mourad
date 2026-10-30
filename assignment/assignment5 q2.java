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
public class question2 {
    
    
 public static double coneVolume(double dValue, double hValue) {
        double radius = dValue / 2.0;
        return (1.0 / 3.0) * Math.PI * radius * radius * hValue;
    }
 
    public static void main(String[] args) {
        // TODO code application logic here
        
    Scanner input = new Scanner(System.in);

        System.out.print("Enter diameter: ");
        double diameter = input.nextDouble();

        System.out.print("Enter height: ");
        double height = input.nextDouble();

        System.out.printf("Volume: %.2f%n", coneVolume(diameter, height));
        input.close();
    }
}

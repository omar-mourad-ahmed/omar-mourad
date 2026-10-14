/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignment1;

import java.util.Scanner;

/**
 *
 * @author msi
 */
public class Assignment1 {

    public static void main(String[] args) {
        
       Scanner input = new Scanner ( System.in) ;
        
        System.out.println(" enter the radius of circle");
        
        
        double radius = input.nextDouble();
        
        double area = Math.PI*Math.pow(radius, 2);
        
        double circumference = 2*Math.PI*radius;
        
        
        System.out.printf("area =%.2f  ", area);
        
        System.out.printf("circumference =%.2f ", circumference);
        
        
    }
}

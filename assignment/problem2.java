/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.assignment1;

import java.util.Scanner;

/**
 *
 * @author msi
 */
public class problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
     Scanner input = new Scanner ( System.in) ;   
        
       System.out.println(" enter the unit price");  
        
        double unitprice = input.nextDouble();
        
        System.out.println(" enter the quantity");  
        
        int quantity = input.nextInt();
        
        final double tax_rate = 0.14;
        
        double subtotal = unitprice*quantity;
        
        double tax = subtotal*tax_rate;
        
        double total = subtotal+tax;
        
         System.out.printf("subtotal =%.2f  ", subtotal);
        
         System.out.printf("tax =%.2f  ", tax);
        
         System.out.printf("total =%.2f  ", total);
        
        
        
    }
    
}

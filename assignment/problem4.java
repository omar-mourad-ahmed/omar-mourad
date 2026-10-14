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
public class problem4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     Scanner input = new Scanner ( System.in) ;      
        
      System.out.println(" enter the days");    
        
      int days = input.nextInt();
      
      int weeks = days/7;
        
       int remainingdays = days%7; 
        
       System.out.println(weeks + "weeks and " + remainingdays + "days");
        
        
    }
    
}

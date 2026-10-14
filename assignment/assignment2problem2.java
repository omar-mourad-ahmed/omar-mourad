/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.assignment2;

import java.util.Scanner;

/**
 *
 * @author msi
 */
public class assignment2problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
      Scanner input = new Scanner ( System.in) ;      
        
      System.out.println(" enter the year");    
        
      int year = input.nextInt();  
        
      if ((year % 4 ==0 && year % 100 !=0)||(year % 400 ==0)){
      
      
      System.out.println(" leap year");
      
      }
        
        
      else {
      
      System.out.println(" not a leap year");
      }
        
        
    }
    
}

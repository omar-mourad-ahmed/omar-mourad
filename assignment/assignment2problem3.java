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
public class assignment2problem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Scanner input = new Scanner ( System.in) ;      
        
      System.out.println(" enter first number");    
        
      double num1 = input.nextDouble();    
        
        
      System.out.println(" enter operator");    
        
      char operator = input.next().charAt(0);    
        
      
      
       System.out.println(" enter second number");    
        
      double num2 = input.nextDouble();    
         
        
       double result;
        
        
       switch (operator) {
    
        case'+': 
            System.out.println(result = num1+num2);
             break;
    
    
    
     case'-': 
             System.out.println(result = num1-num2);
             break;
    
    
    
     case'*': 
             System.out.println(result = num1*num2);
             break;
    
    
     case'/': 
             System.out.println(result = num1/num2);
             break;
    
    }
        
        
    }
    
}

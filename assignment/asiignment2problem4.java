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
public class asiignment2problem4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
      Scanner input = new Scanner ( System.in) ;      
        
      System.out.println(" enter three sides");    
          
        int a = input.nextInt();
        
         int b = input.nextInt();
        
         int c = input.nextInt();
        
        if ( a<=0 || b<=0 || c<=0 || a>=b+c || b>=a+c || c>a+b){
        
        System.out.println(" not a vaild triangle");
        
        }
        
        else if(a==b && b==c){
        
        System.out.println(" equilateral triangle");
        }
        
        
        
         else if(a==b || b==c || a==c){
        
        System.out.println(" isosceles triangle");
        }
        
         else {
        
        System.out.println(" scalene triangle");
        }
        
        
    }
    
}

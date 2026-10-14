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
public class problem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Scanner input = new Scanner ( System.in) ;      
        
      System.out.println(" enter score1");    
        
       int score1 = input.nextInt();
        
        System.out.println(" enter score2");  
        
        int score2 = input.nextInt();
        
        System.out.println(" enter score3");  
        
        int score3 = input.nextInt();
        
        double avg = (score1+score2+score3)/3.0;
        
        System.out.println("average = ");
        
        System.out.println(Math.round(avg));
        
        System.out.printf("%.2f",avg);
        
    }
    
}

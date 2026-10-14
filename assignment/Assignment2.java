/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignment2;

import java.util.Scanner;

/**
 *
 * @author msi
 */
public class Assignment2 {

    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in) ;      
        
      System.out.println(" enter the score");    
        
      int score = input.nextInt();
      
      if( score >=90){
      
      System.out.println(" grade A");
      }
      
      
      else if( score <90 && score >= 80){
      
      System.out.println(" grade B");
      }
      
      
       else if( score <80 && score >= 70){
      
      System.out.println(" grade C");
      }
      
      
       else if( score <70 && score >= 60){
      
      System.out.println(" grade D");
      }
      
      
       else {
      
      System.out.println(" grade F");
      }
      
    }
}

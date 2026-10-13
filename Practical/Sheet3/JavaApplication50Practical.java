/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication50.practical;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author STUDENT
 */
public class JavaApplication50Practical {

    public static void main(String[] args) {
      
        
Scanner input=new Scanner(System.in);
    
    int num = 0,max=0;
    System.out.println("enter positiv numbers (0 to stop)");
    num=input.nextInt();
    while(num!=0){
        if(num>max){
             max=num;
             
        }
        num=input.nextInt();
    }
         System.out.println("largest number="+max); 
  }
    
    }

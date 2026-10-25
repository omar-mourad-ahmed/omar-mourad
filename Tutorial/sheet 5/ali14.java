/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication7707;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class JavaApplication7707 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input=new Scanner(System.in);
       int[] sales=new int[7];
       int total=0;
       int count=0;
       
       System.out.print("Enter sales of 7:");
       
       for(int i=0;i<7;i++){
           sales[i]=input.nextInt();
           total+=sales[i];
           
           if (sales[i]>20){
               count++;
           }
       }
       
       double average = (double)total/7;
       System.out.print("total"+total);
       System.out.print("days greater than 20:"+count); 
       System.out.print("average:"+Math.round(average));
       
    }
    
}

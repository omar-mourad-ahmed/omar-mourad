/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package omar30;

import java.util.Scanner;

/**
 *
 * @author STUDENT
 */
public class question1 {
public static int getlnt (Scanner s ,String prompt){
   System.out.print(prompt);
   return s.nextInt();
   
}
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s= new Scanner (System.in);
        int age= getlnt(s, "enter your age ");
         System.out.print("Recorded Age:"+age);
        
    }
    
}

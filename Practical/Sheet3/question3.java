/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication50.practical;

import java.util.Scanner;

/**
 *
 * @author STUDENT
 */
public class question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
         Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        int reverse= 0;
        while(number !=0){
        int digit =number%10;
        reverse =reverse*10 +digit;
        number/=10;
    }
    System. out.println(reverse);
}}

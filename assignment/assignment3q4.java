/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.assignment3;

import java.util.Scanner;

/**
 *
 * @author msi
 */
public class assignment3q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        int n;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int count = 0;

        while (true) {
            n = input.nextInt();

            if (n == 0) {
                break;
            }

            if (n > 0) {
                if (n > max) {
                    max = n;
                }

                if (n < min) {
                    min = n;
                }

                sum += n;
                count++;
            }
        }

        if (count > 0) {
            System.out.println("Largest = " + max);
            System.out.println("Smallest = " + min);
            System.out.println("Average = " + (double) sum / count);
        }
    }
    
}

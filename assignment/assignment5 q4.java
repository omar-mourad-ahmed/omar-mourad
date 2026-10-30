/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment4;

import java.util.Scanner;

/**
 *
 * @author Ahmed Sabry
 */
public class question4 {
    
public static String maskEmail(String email) {
        String trimmedEmail = email.trim();
        int atIndex = trimmedEmail.indexOf('@');

        if (atIndex == -1) {
            return "Invalid Email";
        }

        String username = trimmedEmail.substring(0, atIndex);
        String domain = trimmedEmail.substring(atIndex + 1).toLowerCase();

        if (username.length() <= 2) {
            return username + "@" + domain;
        }

        String maskedUsername = username.substring(0, 2)
                + "*".repeat(username.length() - 2);

        return maskedUsername + "@" + domain;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        String email = input.nextLine();
        System.out.println(maskEmail(email));

        
    }
}
    

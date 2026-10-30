/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment4;

/**
 *
 * @author Ahmed Sabry
 */
public class question3 {

    public static double average(int a, int b) {
        return (a + b) / 2.0;
    }

    public static double average(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    public static double average(double a, double b) {
        return (a + b) / 2.0;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(average(4, 7));
        System.out.println(average(2, 4, 9));
        System.out.println(average(2.5, 3.5));
        
    }
    
}

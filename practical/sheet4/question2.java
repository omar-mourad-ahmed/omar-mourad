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
public class question2 {
public static double calculatedDistance(double x1 ,double y1 ,double x2, double y2){
  return Math .sqrt (Math . pow(x2-x1,2)+ Math. pow(y2-y1,2));
}
     
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        System .out.println("enter x1 and y1:");
        double x1=s.nextDouble();
        double y1=s.nextDouble();
        System .out.println("enter x2 and y2:");
         double x2=s.nextDouble();
        double y2=s.nextDouble();
    double distancs =calculatedDistance (x1,y1,x2,y2);
       System .out.printf("distancs %.f%n",distancs);   
    
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;
import java.util.Scanner;

/**
 *
 * @author deane
 */
public class BloodPressureClassification {
    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);   
    
    int identityNumber; 
    
    System.out.print("Identity number: ");
    identityNumber = input.nextInt(); //This takes the input from the user

    if (identityNumber >= 106 && identityNumber <= 115) /*if identity is equal 
        to or more than 106 and is equal to or less than 115 then output = Serious Problem */
    {
        System.out.print(identityNumber + " Serious Problem");
    }
    else if (identityNumber >= 91 && identityNumber <= 105) /*if identity is equal 
        to or more than 91 and is equal to or less than 105 then output = Hypertension */
    {
        System.out.print(identityNumber + " Hypertension");
    }
    else if (identityNumber >= 70 && identityNumber <= 90) /*if identity is equal 
        to or more than 70 and is equal to or less than 90 then output = Normal */
    {
        System.out.print(identityNumber + " Normal");
    }
    else System.out.print(identityNumber + " ERROR");
}
}

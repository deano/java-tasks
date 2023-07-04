/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;
import java.util.Scanner;

/**
 *
 * @author deane
 */
public class PizzaOrder {

    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    final double smallPizza = 5.80;
    final double mediumPizza = 7.20;
    final double largePizza = 8.60; 
    
    System.out.println("Enter how many small pizzas: ");
    int sPizza = input.nextInt();
    
    System.out.println("Enter how many medium pizzas: ");
    int mPizza = input.nextInt();    
    
     System.out.println("Enter how many large pizzas: ");
    int lPizza = input.nextInt();     
   
    
    double totalOrder; 
    totalOrder = sPizza * (smallPizza) + mPizza * (mediumPizza) + lPizza * (largePizza);

    
     System.out.println("The total order is £" + totalOrder);
}
}

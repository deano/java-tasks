/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test4;
import java.util.Scanner;
/**
 *
 * @author deane
 */
public class BestFriends {
     /* PSEUDO CODE
    USER INPUT friend A's top three preferences
    USER INPUT friend B's top three preferences
   
    DISPLAY preferences
    
    IF friend A has matching preferences as friend B = Good match
    ELSE if friend B has no matching preferences as friend B = Not good match 
    */
    
public static void main(String[] args) {
Scanner input = new Scanner(System.in); //This creates the scanner
         
    //Prompts the user to enter three preferences
    System.out.print("Enter friend A's top three preferences: ");
    int A1 = input.nextInt();
    int A2 = input.nextInt();
    int A3 = input.nextInt();
 
    System.out.print("Enter friend B's top three preferences: ");
    int B1 = input.nextInt();
    int B2 = input.nextInt();
    int B3 = input.nextInt();
              
    //display the match preferences
    matchPreferences(A1, A2, A3, B1, B2, B3);   
    
    
    }
    //method
    public static boolean matchPreferences(
    int friendA1, int friendA2, int friendA3,
    int friendB1, int friendB2, int friendB3) {
    
    if (friendA1 == friendB1 && friendA2 == friendB2 && friendA3 == friendB3) {
    System.out.print("Good match"); //prints out the output
    
    }
    else (friendA1 >< friendB1 && friendA2 >< friendB2 && friendA3 >< friendB3) {
    System.out.print("Not good match"); //prints out the output
     
       
    }   
   

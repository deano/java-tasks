/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test5;
import java.util.Scanner;

/**
 *
 * @author deane
 */
public class LeastMatch {

    /* PSEUDO CODE 
    
    OUTPUT = "Friend" + x + " shares the least preferences with the "
    + "student with " + y + " shared preferences" IF at least one of
    the five friends shares a preference from (2, 3, 7, 5) with the student.
    
    IF none of the five friends shares any preference with the student 
    OUTPUT = "No Match"
  
    
    */
    

public static void main(String[] args) {
Scanner input = new Scanner(System.in); //This creates the scanner
    
       int y [] = new int [5];
       int x [][] = new int [5][5];
       
    int student [] = {2, 3, 1, 7, 5};

    int friends [][] = {
        {1, 3, 4, 5, 7},
        {3, 5, 8, 6, 9},
        {6, 4, 1, 2, 3}, 
        {9, 7, 5, 3, 1}, 
        {8, 6, 4, 2, 1}};
 
    //prints out the output of the program
    System.out.println("Friend" + x + " shares the least preferences with the "
     + "student with " + y +  " shared preferences");
    
   //displays the students preferences
    sharedPreferences(student);

}
public void sharedPreferences(int x [][]) {
        
           
        for(int row = 0; row < x.length; row++) {
            for(int column = 0; column < x[row].length; column++) {
                
           
            }
        }
}
}



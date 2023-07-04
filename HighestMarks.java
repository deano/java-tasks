/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test3;
import java.util.Scanner;
/**
 *
 * @author deane
 */
public class HighestMarks {
   
    /* PSEUDO CODE
    
    if moduleCode is less than 101 
        and more than 109 then then output = ERROR: Invalid input
    
    ASKS for Input for marks of easch student
    if the marks are less than 0 and more than 100
        then output = ERROR: Invalid Marks
    
    else if the INPUT is valid then OUTPUT = Highest Score
    */
    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int moduleCode = 0;
    int numberOfStudents = 0;
    
    //these create the variables for the 2 inputs
    System.out.println("Please enter the module code and the number of students");
        moduleCode = input.nextInt();
        
    if (moduleCode < 101 && moduleCode > 109) { /* if moduleCode is less than 101 
        and more than 109 then then output = ERROR: Invalid input
        */
    
        System.out.println("ERROR: Invalid Input");  //this prints out the output
    }
    
    int marks = 0;
    System.out.println("Please enter the marks of each student"); //asks for user to enter marks for student
    marks = input.nextInt();
    
    if (marks < 0 && marks > 100) /* if the marks are less than 0 and more than 100
        then output = ERROR: Invalid Marks
        */
    {
        System.out.println("ERROR: Invalid Marks");     //prints out the output  
    }
    int i;
    for (i = 0; i < 100; i++) { 
        System.out.println("Highest Score = " + marks);
    }
    
}
}

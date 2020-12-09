/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user.input.variations.of.numbers;

import java.util.Scanner;

/**
 *
 * @author Kate
 */
public class UserInputVariationsOfNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // create Scanner to obtain input from command window
        Scanner input = new Scanner (System.in);     
              
        // Find the largest number
        
        System.out.println ( "1. Enter three numbers to find the largest:" ); // prompt for input from user
        
        double num1 = input.nextDouble(); // initializing the variable and reading first number value from user
        double num2 = input.nextDouble(); // initializing the variable and reading second number value from user
        double num3 = input.nextDouble(); // initializing the variable and reading third number value from user
        
        // process of comparing numbers
        if (num1 > num2)
        {
            
            //if...else is nested in the if statement
            if  (num1 > num3) // if num1 is larger than num3
            {
                System.out.println (num1+" is largest number."); // print num1; 
            }
            else // else num3 is larger
            {
                System.out.println (num3+" is largest number."); // print num3;
            }
            
        }
        
        else if (num2 > num3) // else if num2 is larger than num3
        {
            System.out.println (num2+" is largest number."); // print num2;
        }
        else // else num3 is the largest
        {
             System.out.println (num3+" is largest number."); // print num3
        }
        
        // Find the maximum
        
        System.out.println ( "\n2. Enter a series of positive numbers to find the maximum. To stop entering enter -1:" ); // prompt for input from user
        
        double num = input.nextDouble(); // initializing the variable number and reading number value from user
        double maximum; // the largest number that the user has entered before entering any negative number
                 
        // process of comparing numbers
        if ( num < 0) // if the user entered a negative number first             
        { 
            // output appropriate message
            System.out.printf ( "You haven't enter any value. Exiting.\n" ); 
        } 
        else // when the user entered a positive number
        {
            maximum = num; // assign value num to the variable maximum
            
            // while is nested in the else statement
            while ( num >= 0 ) // loop until the user enters positive numbers
            {
                System.out.println ( "\nEnter next positive number:" ); // prompt for input from user
                num = input.nextDouble(); // read number value from user
                if ( num > maximum) // if the number entered by the user is greater than the current value the maximum
                {
                    maximum = num; // put the value entered by the user in the maximum variable as a new value
                }
            }
            // output the maximum value of numbers
            System.out.printf ( maximum+" is maximum\n" ); 
        }
        
     // Find the average value
     
        // initializing the variables
        int numb1 = 0;   
        int numb2 = 0;  
        int numb3 = 0;  
        int sumNumb;         
        double average;
                        
        boolean flag = Boolean.FALSE; // initializing the variable flag and assigning it the value FALSE
        
        while (!flag) // loop until the flag takes the value TRUE
        {
           System.out.println( "\n3. Enter three numbers to find the average value.\n" ); // prompt for input from user
           System.out.println( "Enter first integer number:" ); // prompt for input first number from user
           numb1 = input.nextInt(); // read first number value from user
           if (numb1 != 0) // if variable numb1 does not equal to zero
               flag = Boolean.TRUE; // assign value TRUE to the variable flag
           
           System.out.println( "Enter second integer number:" ); // prompt for input second number from user
           numb2 = input.nextInt(); // read second number value from user
           if (numb2 != 0) // if variable numb2 does not equal to zero
               flag = Boolean.TRUE; // assign value TRUE to the variable flag
           
           System.out.println( "Enter third integer number:" ); // prompt for input third number from user
           numb3 = input.nextInt(); // read third number value from user
           if (numb3 != 0) // if variable numb3 does not equal to zero
               flag = Boolean.TRUE; // assign value TRUE to the variable flag
           
           if (!flag) // if after three entered numbers the flag is still not set to TRUE, output appropriate message
           System.out.println( "All entered numbers are zeros. Please enter three other numbers." );    
        }
        average = ((double)numb1 + (double)numb2 + (double)numb3)/3; // calculate an avarage of three numbers
        System.out.println( "Average is: " + average );  // output the average value
        
        // coefficients of a degree two polynomial        
    
        System.out.println( "\n4. Enter the coefficients of a degree two polynomial:" ); // prompt for input from user
        
        // initializing the variables and reading numbers value from user
        double a = input.nextDouble(); 
        double b = input.nextDouble();
        double c = input.nextDouble();
        double delta = b * b - 4.0 * a * c; // initializing and calculating the value of delta
        double x1; // initializing the variable for real root
        double x2; // initializing the variable for unequal root
                             
        // condition for two answers
        if (delta > 0) // if delta is grater then zero
        {
           x1 = (-b + Math.sqrt(delta)) / (2 * a); // calculating the real root
           x2 = (-b - Math.sqrt(delta)) / (2 * a); // calculating the unequal root
           System.out.println ( x1 + " and " + x2 + " are real and unequal roots."); // output of a real and unequal roots
        }
        
        // condition for one answer
        else if (delta == 0) // else if delta is equal to zero
        {
           x1 = -b /(2 * a); // calculating of the real and unequal roots (they take the same value because the delta is zero)
           System.out.println ( x1 + " and " + x1 + " are real and equal roots."); // output of a real and unequal root
        }
                    
        // condition for no real answer
        else // delta is negative number
        {
            // output appropriate message
            System.out.println ( "Roots are imaginary." );
        }
          
          // multiplication table for 5       
      
        System.out.println( "\n5. Enter odd or even number to make the multiplication table for 5:" ); // prompt for input from user
        
        int number; // initializing the variable number
        number = input.nextInt(); // input number by user 
        int multiplier = 1; // initializing a variable for the multiplication table and assigning it the value 1
        int result; // the result of the multiplication
        
        if ( number % 2 == 0 ) // if number is positive or negative even numbers
        {
            while ( multiplier <= 10) // loop 10 times until we reach 11 (based on 10 multipliers in the multiplication table)
            {
                result = 5 * multiplier; // calculating the result (multiplication table for 5)
                System.out.println( "5 * " + multiplier + " = " + result ); // output the result of multiplication
                multiplier = multiplier + 1; // add 1 to the multiplier and continue the loop
            }
        }
        
        else if ( number % 2 == 1)
        {
            // else if the user entered a positive or negative odd number, output appropriate message
            System.out.println( "What an odd number!" );            
        }
        
    System.out.println( "\nAttention! All calculations are completed. If you want to repeat the calculation again, please press F6." ); 
    }
}

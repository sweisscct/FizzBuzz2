/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fizzbuzz2;

/**
 *
 * @author Lecturer
 */
public class FizzBuzz2 {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
        /*
        FizzBuzz
        Print the numbers between 1 and 150
        If a number is divisible by 3, print Fizz
        If a number is divisible by 5, print Buzz
        If a number is divisible by both, print FizzBuzz
        */

    /**
     *
     * @param n
     * 
     * 
     * 
     */
       
    for (int n = 1; n <= 150; n++) {
            System.out.println(n);
            
        // check if divisible by 3.
        if (n % 3 == 0) {
            System.out.println("Fizz");
        }

        // check if divisible by 5.
        else if (n % 5 == 0) {
            System.out.println("Buzz");
        }

        // check if divisible by both 3 or 5.
        else if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("FizzBuzz");
        }
 
  
        }  
       }
    }
    
    


// if (i % 3 == 0) s += "Fizz"; divisible by 3
//if else (i % 5 == 0) s += "Buzz";


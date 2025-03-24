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
        int iterator = 1;                                                                                                   
        while (iterator < 150){                                                                                             
            if (iterator % 3 == 0 && iterator % 5 == 0){                                                                    
                System.out.println(iterator + " FizzBuzz");                                                                 
            } else if (iterator % 3 == 0){                                                                                  
                System.out.println(iterator + " Fizz");                                                                     
            } else if (iterator % 5 == 0) {                                                                                 
                System.out.println(iterator + " Buzz");                                                                     
            }                                                                                                               
            iterator++;                                                                                                     
        }
    }
    
}

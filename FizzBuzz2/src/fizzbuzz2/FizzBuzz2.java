/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fizzbuzz2;

import java.util.ArrayList;

/**
 *
 * @author Lecturer
 */
public class FizzBuzz2 {
    
    static ArrayList<String> fizzBuzz(int n){
      
        ArrayList<String> res = new ArrayList<>();

        for (int i = 1; i <= n; ++i) {
          
            // Check if i is divisible by both 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
              
                // Add "FizzBuzz" to the result list
                res.add("FizzBuzz");
            }
          
            // Check if i is divisible by 3
            else if (i % 3 == 0) {
              
                // Add "Fizz" to the result list
                res.add("Fizz");
            }
          
            // Check if i is divisible by 5
            else if (i % 5 == 0) {
              
                // Add "Buzz" to the result list
                res.add("Buzz");
            }
            else {
              
                // Add the current number as a string to the
                // result list
                res.add(Integer.toString(i));
            }
        }

        return res;
    }

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
        int n = 150;
        ArrayList<String> res = fizzBuzz(n);
        for (String s : res) {
            System.out.print(s + " ");
        }
        
    }
    
}

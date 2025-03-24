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
        
        int currentNumber; 
        
        for(int i=0; i<=149; i++){
        currentNumber = i + 1;
        
        if (currentNumber%3 == 0 && currentNumber%5 ==0){
            System.out.println("FizzBuzz \n");
        } else if(currentNumber%3 == 0){
            System.out.println("Fizz \n");
        }else if(currentNumber%5 == 0){
            System.out.println("Buzz \n");
        }else {
            System.out.println(currentNumber + "\n");
        }
        }
    }
    
}

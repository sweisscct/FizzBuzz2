/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fizzbuzz2;

import java.util.Scanner;

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
        System.out.println("Welcome to fizzBuzz please enter a number to start");
        Scanner scanner = new Scanner(System.in);
        int choice;
        while (true) {
            if (scanner.hasNextInt()) { 
                choice = scanner.nextInt();
                break; 
            } else {
                System.out.println("Invalid input! Please enter a valid integer:");
                scanner.next(); 
            }
        }
        
        if (choice % 3 == 0 && choice % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (choice % 3 == 0) {
            System.out.println("Fizz");
        } else if (choice % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println("its not divisible by 3 or 5 ");
        }
        
        scanner.close();
    }
       
    
}

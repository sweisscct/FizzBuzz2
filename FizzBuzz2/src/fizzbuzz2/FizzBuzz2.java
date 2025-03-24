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
import java.util.Scanner;

public class FizzBuzz2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        


        System.out.println("Welcome to fizzBuzz please enter a number to start");
        while (true) {
            if (scanner.hasNextInt()) { 
                number = scanner.nextInt();
                break; 
            } else {
                System.out.println("Invalid input! Please enter a valid integer:");
                scanner.next(); 
            }
        }
        scanner.close();
       
       
    

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (number % 3 == 0) {
            System.out.println("Fizz");
        } else if (number % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println("try again");
        }
    }

}

    


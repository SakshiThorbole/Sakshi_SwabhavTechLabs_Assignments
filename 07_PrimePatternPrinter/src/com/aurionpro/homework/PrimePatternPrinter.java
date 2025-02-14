package com.aurionpro.homework;

import java.util.Scanner;

public class PrimePatternPrinter {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner1 = new Scanner(System.in);
        int number = scanner1.nextInt();
        
        int primesToPrint = 1;
        int currentPrime = 2;
        
        for(int i = 1; i <= number; i++) {
            int count = 0;
            while (count < primesToPrint) {
                if (isPrime(currentPrime)) {
                    System.out.print(currentPrime + " ");
                    count++;
                }
                currentPrime++;
            }
            primesToPrint++;
            System.out.println();
        }
        scanner1.close();
    }
    
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        int sqrt = (int) Math.sqrt(num);
        for (int i = 2; i <= sqrt; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

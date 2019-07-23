package com.company;

import java.util.Scanner;

public class PrimeNumber1toN {

    private static Scanner scanner = new Scanner( System.in );

    public static void main(String[] args) {

        System.out.println("Enter max number: ");

        String input = scanner.nextLine();
        double maxNumber = Integer.parseInt( input );

        System.out.println("List of the prime number between 1 - " + maxNumber);
        double startTime = System.currentTimeMillis();
        for (int num = 2; num <= Math.pow(num,2); num++) {
            boolean isPrime = true;
            for (double i = 2; i <= Math.sqrt(num); i++)
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }

            if (isPrime == true)
                System.out.println(num);
        }
        long endTime = System.currentTimeMillis();
        String totalTime = ((endTime - startTime)/1000.0+"s");
        System.out.println(totalTime);
    }
}
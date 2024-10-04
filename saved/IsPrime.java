package com.saved;

import java.util.Scanner;

public class IsPrime {

    static boolean isPrime(int number){
        if (number <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(number) ; i++) {
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int number = in.nextInt();
        if (isPrime(number)){
            System.out.println("Given number is a prime number");
        }else {
            System.out.println("Given number isn't a prime number");
        }
    }
}

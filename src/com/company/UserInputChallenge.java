package com.company;

import java.util.Scanner;

public class UserInputChallenge {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n= 1;
        int sum = 0;
        while(n<=10){
            System.out.println("Enter the number #"+n);
            int num = scanner.nextInt();     //can use hasNextInt also
            sum = sum+num;
            n++;
        }

        System.out.println("Sum of ten numbers "+sum);
        scanner.close();
    }
}

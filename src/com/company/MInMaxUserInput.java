package com.company;

import java.util.Scanner;

public class MInMaxUserInput {

    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        int max = 0;  //this can also be solved by assigning Integer.max and Integer.Min value
        int min = 0;
        boolean first = true;
        while(true){
            System.out.println("Enter Number: ");
            boolean isInt = scanner.hasNextInt();
            if(isInt){
                int num = scanner.nextInt();
                if(first){
                    min = num;
                    max = num;
                    first=false;
                }
                if(num>max){
                    max = num;
                }
                if(num<max){
                    min = num;
                }

            }else{
                System.out.println("Max: "+max);
                System.out.println("Min: "+min);
                break;
            }

        }
        scanner.close();
    }
}

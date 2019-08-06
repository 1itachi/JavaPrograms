package coding.challenge;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double avg = 0;
        int counter = 0;
        boolean flag = true;

        while(flag){
            if(scanner.hasNextInt()){
                int a = scanner.nextInt();
                sum = sum+a;
                counter++;
            }else{
                flag = false;
            }
        }
        if(sum!=0){
            avg = sum/counter;
            avg = (int)Math.round(avg);
        }


        System.out.println("SUM = "+ sum+ " AVG = " +avg);
    }
}

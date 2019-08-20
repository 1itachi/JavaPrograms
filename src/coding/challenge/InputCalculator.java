package coding.challenge;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double avg = 0;
        int counter = 0;
        int finalAvg = 0;
        int finalSum = 0;
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
            System.out.println(counter);
            avg = Math.round(sum/counter);
            finalAvg = (int)avg;
            finalSum = (int)sum;
            System.out.println(sum);
        }
        System.out.println("SUM = "+ finalSum+ " AVG = " +finalAvg);
    }
}

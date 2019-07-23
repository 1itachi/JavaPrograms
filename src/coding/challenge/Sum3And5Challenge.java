package coding.challenge;

public class Sum3And5Challenge {
    public static void sumNumbers(){
        int count = 0;
        int sum = 0;
        for(int i =1; i<=1000; i++){
            if((i%3==0)&&(i%5==0)){
                count++;
                sum = sum + i;
            }
            if(count == 5){
                break;
            }
        }

        System.out.println("Sum of first five numbers divisible by both 3 & 5 is "+sum);
    }
}

package coding.challenge;

public class sumDigits {

    public static int SumofDigits(int num){
        if(num<10) {
            return -1;
        }
        int sum = 0;
        while(num>0){
            sum = sum + num%10;
            num = num/10;
        }
        return sum;
    }
}

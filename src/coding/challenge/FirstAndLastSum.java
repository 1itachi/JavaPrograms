package coding.challenge;

public class FirstAndLastSum {

    public static int sumFirstAndLastDigit(int number){
        if(number<0){
            return -1;
        }
        int num = number;
        int last = num%10;
        int first = 0;
        while(num>0){
            first = num%10;
            num = num/10;
        }

        return first+last;
    }
}

package coding.challenge;

public class largestPrime {
    public static int getLargestPrime(int number) {
        if (number < 2) {
                return -1;
        }

        int largest = 0;
        boolean flag = false;
        for(int i= 2; i<number ; i++){
            if(number%i == 0){
               for(int j=2; j<i; j++) {
                   if (i % j == 0) {
                       flag = true;
                   }
               }
               if(flag == false){
                   largest = i;
               }
               flag = false;
            }
        }

        if(largest==0){
            return number;
        }
        return largest;
    }

}

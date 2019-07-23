package coding.challenge;

public class PrimeNumber {

    public static void rangeofPrime(int n, int rangeCount){
        int count = 0;

        for(; n>=0;n++){
            if(isPrime(n)){
                count = count+1;
                System.out.println("this is a prime "+n);
            }
            if(count>=rangeCount){
                break;
            }
        }

    }


    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }

        for( int i = 2; i<=n/2; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}

package coding.challenge;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){
        if(first<10||second<10){
            return -1;
        }

        int a = Math.min(first,second);
        int b = Math.max(first,second);
        int gcd = 0;
        for(int i=1; i<=a ; i++){
            if(a%i==0&&b%i==0){
                gcd = i;
            }
        }
        return gcd;
    }
}

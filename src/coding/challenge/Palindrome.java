package coding.challenge;

public class Palindrome {
    public static boolean isPalindrome(int number){
        int revNum = 0;
        int num = Math.abs(number);
        while(num>0){
            revNum = (revNum*10) + (num%10);
            num = num/10;
        }
        if(revNum == Math.abs(number)){
            return true;
        }
        return false;
    }
}

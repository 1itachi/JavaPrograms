package coding.challenge;

public class SharedDigit {

    public static boolean hasSharedDigit(int number1, int number2){

        if(number1<10 || number1>99 ||number2<10 || number2>99){
            return false;
        }

        int num1 = number1;
        while(num1>0){
            int digitsOfNumber1 ;
            int num2;
            digitsOfNumber1= num1 % 10;
            num1 = num1/10;
            num2 = number2;
            while(num2>0){
                int digitsOfNumber2;
                digitsOfNumber2 = num2%10;
                num2 = num2/10;
                if(digitsOfNumber1 == digitsOfNumber2){
                    return true;
                }
            }
        }
        return false;
    }
}

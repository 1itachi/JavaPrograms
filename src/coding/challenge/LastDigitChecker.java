package coding.challenge;

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int num1, int num2, int num3){

        if(isValid(num1) == false||isValid(num2) == false||isValid(num3)== false){
            return false;
        }

        int lastdigitofNum1 = num1%10;
        int lastdigitofNum2 = num2%10;
        int lastdigitofNum3 = num3%10;

        if((lastdigitofNum1==lastdigitofNum2)||(lastdigitofNum1 == lastdigitofNum3)||(lastdigitofNum2==lastdigitofNum3)){
            return true;
        }
        return false;
    }

    public  static  boolean isValid(int num){
        if(num<10 || num>1000){
            return false;
        }
        return true;
    }
}

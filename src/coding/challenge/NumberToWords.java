package coding.challenge;

public class NumberToWords {
    public static void numberToWords(int num){
        if(num<0){
            System.out.println("Invalid Value");
        }
        int n = reverse(num);
        if(num == 0){
            System.out.println("Zero");
        }

        while(n>0){
            int originalDigitCount = getDigitCount(num);
            int reverseDigitCount = getDigitCount(n);
            int diffCount = 0;
            if(reverseDigitCount != originalDigitCount){
                 diffCount = originalDigitCount-reverseDigitCount;
            }
            while(diffCount!= 0){
                System.out.println("Zero");
                diffCount--;
            }

            int digit = n%10;
            n = n/10;
            switch(digit){
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                case 0:
                    System.out.println("Zero");
                    break;
            }
        }

    }

        public static int reverse(int num){

            int reverseNum = 0;
            while(num!=0){
                reverseNum = reverseNum*10 + num%10;
                num = num/10;
            }
            return reverseNum;
        }

        public static int getDigitCount(int num){
             if(num<0){
                return -1;
            }
             if(num == 0){
                 return 1;
             }
            int digitCount = 0;
            while(num!=0){
                digitCount += 1;
                num = num/10;
            }
            return digitCount;
        }

}

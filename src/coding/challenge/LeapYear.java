package coding.challenge;

public class LeapYear {
    public static boolean isLeapYear(int year){
        boolean isLeapyear = false;

        if(year >= 1 && year<= 9999){
            if(year%4 == 0){
                if(year%100 == 0){
                    if(year%400 == 0){
                        isLeapyear = true;
                        return isLeapyear;
                    }
                    return isLeapyear;
                }
                isLeapyear = true;
                return isLeapyear;
            }
            return isLeapyear;
        }
        return isLeapyear;
    }
}

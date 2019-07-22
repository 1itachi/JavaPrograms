package coding.challenge;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int time){
        if(barking == true){
            if((time>=0 && time<8) || (time>22 && time<=23)){
                return true;
            }
            return false;
        }
        return false;
    }
}

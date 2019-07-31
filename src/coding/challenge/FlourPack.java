package coding.challenge;

public class FlourPack {
    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int minBigCount = goal / 5;
        int minSmallCount = goal % 5;

        if (minBigCount <= bigCount && minSmallCount <= smallCount) {
            return true;
        }

        if (minBigCount > bigCount) {
            int diff = goal - (5*bigCount);
            if (smallCount >= diff) {
                return true;
            }
        }
        return false;
    }
}


//        if(smallCount/5 >0 && goal>=5){
//            bigCount = bigCount+(smallCount/5);
//            smallCount = smallCount%5;
//        }
//        int minBig = goal/5;
//        int minSmall = goal%5;
//        if(minBig > bigCount){
//            return false;
//        }
//        if(minSmall > smallCount){
//            return false;
//        }
//        int totalBigCount = bigCount*5;
//        int totalSmallCount = smallCount*1;
//        int sum = totalSmallCount+ totalBigCount;
//        if(sum>=goal) {
//               int finalSum = minBig*5+minSmall;
//               if(finalSum == goal){
//                   return true;
//               }
//        }
//        return false;
//    }


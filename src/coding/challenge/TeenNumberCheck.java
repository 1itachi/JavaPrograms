package coding.challenge;

public class TeenNumberCheck {
    public static boolean hasTeen(int par1, int par2, int par3){
        if(isTeen(par1) || isTeen(par2) || isTeen(par3)){
            return true;
        }
        return false;
    }

    public static boolean isTeen(int par1){
        if(par1>=13 && par1 <=19){
            return true;
        }
        return false;
    }
}

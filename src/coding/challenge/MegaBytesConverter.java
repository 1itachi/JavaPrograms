package coding.challenge;

import java.awt.*;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }else{
            int megabytes = Math.abs(kiloBytes/1024);
            int remainingKiloBytes = (kiloBytes%1024);

            //System.out.println(megabytes);
            //System.out.println(remainingKiloBytes);
            System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + remainingKiloBytes + " KB");
        }

    }
}

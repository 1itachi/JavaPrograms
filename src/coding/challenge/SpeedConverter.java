package coding.challenge;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour<0){
            return -1;
        }
        return Math.round(kilometersPerHour);
    }

    public static void printConversion(double kilometersPerHour){
        toMilesPerHour(kilometersPerHour)
        System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h" );
    }

}
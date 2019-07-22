package coding.challenge;

public class Main {
    public static void main(String[] args) {
        SpeedConverter.printConversion(95.75);
        MegaBytesConverter.printMegaBytesAndKiloBytes(14000);
        System.out.println("Barking Dog::::::" + BarkingDog.shouldWakeUp(true, 7));
        System.out.println("Is 1999 a leap year?" + LeapYear.isLeapYear(1999));
    }
}

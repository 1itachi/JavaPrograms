package coding.challenge;

public class Main {
    public static void main(String[] args) {
        SpeedConverter.printConversion(95.75);
        MegaBytesConverter.printMegaBytesAndKiloBytes(14000);
        System.out.println("Barking Dog::::::" + BarkingDog.shouldWakeUp(true, 7));
        System.out.println("Is 1999 a leap year? " + LeapYear.isLeapYear(1999));
        System.out.println("Are two decimal numbers (6.75332 & 6.75312) equal to three decimal points? " + DecimalComparator.areEqualByThreeDecimalPlaces(3.176, 3.175));
        System.out.println("has teen? "+ TeenNumberCheck.hasTeen(78,39,17));
    }
}

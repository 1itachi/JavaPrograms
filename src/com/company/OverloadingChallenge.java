package com.company;

public class OverloadingChallenge {
    public static void main (String[] args){
        System.out.println("Inches to centimeters "+ calcFeetAndInchesToCentimeters(6));
    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches){
        double centi;
        if((feet>=0)&&(inches>=0 && inches<=12)){
            centi =  (30.48*feet + inches*2.54);
            return centi;
        }
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(int inches){
        if(inches>=0){
            int feet = inches/12;
            inches = inches%12;
            return calcFeetAndInchesToCentimeters(feet,inches);
        }
        return -1;
    }

}

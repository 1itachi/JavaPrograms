package coding.challenge;


public class EqualityPrinter {
    public static void printEqual(int para1, int para2, int para3){
        if(para1<0||para2<0||para3<0){
            System.out.println("Invalid Value");
        }else if(para1==para2 && para2==para3){
            System.out.println("All numbers are equal");
        }else if(para1!=para2 && para2!=para3 && para3!=para1){
            System.out.println("All numbers are different");
        }else{
            System.out.println("Neither all are equal or different");
        }
    }
}

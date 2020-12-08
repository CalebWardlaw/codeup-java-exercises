import java.util.Scanner;
import java.lang.Math;



public class HighLow {
    public static void main(String[] args){

//        Scanner sc = new Scanner(System.in);
////
////
//        // Generate random number between 1 to 100
//        double a = 1 + (int)(Math.random() * 100);
//
//        System.out.println("A random number has been chosen. What is it?");
//
//        int userChoice = sc.nextInt();
//        do {
//            if (userChoice > a){
//                System.out.println("LOWER");
//                return;
//            }
//            if (userChoice < a){
//                System.out.println("Higher");
//                return;
//            }
//            else if (userChoice == a){
//                System.out.println("GOOD GUESS!");
//                break;
//            }
//        } while (userChoice != a);
    }

    public static void playHighLow(){
        Scanner sc = new Scanner(System.in);
        int randomNum = pickNumber();
    }

    public static int pickNumber(){
        // Generate random number between 1 to 100
       return 1 + (int)(Math.random() * 100);
    }


}

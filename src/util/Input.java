package util;
import java.util.Scanner;


public class Input {

    //Inside of util, create a class named Input that has a private property named scanner
    private Scanner scanner;
//    When an instance of this object is created,the scanner property should be set to a new instance
//    of the Scanner class.
    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        System.out.println("Enter a string");
        //Must have return, since type is not void
        return this.scanner.nextLine();
    }

    public boolean yesNo(){
        System.out.println("Yes or no y/n");
        return this.scanner.nextBoolean();
    }
    //Will need to be init. in person.java for min and max
    public int getInt(int min, int max){
        //set userInput for comparison by do while
        int userInput = 0;
        do {
            System.out.print("Enter a number between " + min + " and " + max);
            //Include userInput inside of do while so it can  change
            userInput = getInt();
        } while (userInput <= min || userInput >= max );
        return userInput;
    }

    public int getInt(){
        System.out.print("Enter a number : \n");
        return this.scanner.nextInt();
    }

    public double getDouble(double min, double max){
        double userInput = 0;
        do{
            System.out.print("Enter a double between " + min + " and" + max);
            userInput = getDouble();
        } while (userInput <= min || userInput >= max);
        return userInput;
    }

    public double getDouble(){
        System.out.print("Enter a number :");
        return this.scanner.nextDouble();
    }
//    public double getDouble(double min, double max){
//        System.out.printf("Enter a number between ")
//    }
}

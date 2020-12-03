import java.util.Scanner;


public class ConsoleExercises {
    public static void main(String[] args)  {
        double pi = 3.1459;
        //2f for the decimal places, but need it to stop rounding
        //Using \n for a new line
        System.out.format("%.2f\n", pi);

        //Scanner is java util. to snatch input
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter an integer \n");
        int userInt = userInput.nextInt();
        //If no integer is entered, runtime error present "exception in threat"

        System.out.println("Enter 3 words \n");
        //Entered two words, finished with exit code 0
        String wordOne = userInput.next();
        String wordTwo = userInput.next();
        String wordThree = userInput.next();

        System.out.println("Finish the song: In West Philadelphia born and raised \n");
//        String sentence = userInput.next();
//        System.out.println(sentence);
        //All lines did not print, just the first word.

        String wholeSentence = userInput.nextLine();
        System.out.println(wholeSentence);

        System.out.println("")
    }
}



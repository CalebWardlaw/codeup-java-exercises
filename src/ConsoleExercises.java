import java.util.Scanner;

import static java.lang.Integer.parseInt;


public class ConsoleExercises {
    public static void main(String[] args)  {
        double pi = 3.14159;
        //2f for the decimal places, but need it to stop rounding
        //Using \n for a new line
//        System.out.printf("\n%.2f\n", pi);

        //Scanner is java util. to snatch input
        Scanner userInput = new Scanner(System.in);

//        System.out.println("\nEnter an integer \n");
//        int userInt = userInput.nextInt();
        //If no integer is entered, runtime error present "exception in threat"

//        System.out.println("\nEnter 3 words \n");
//        //Entered two words, finished with exit code 0
//        String wordOne = userInput.next();
//        String wordTwo = userInput.next();
//        String wordThree = userInput.next();

//        System.out.println(wordOne);
//        System.out.println(wordTwo);
//        System.out.println(wordThree);

//        System.out.println("\nFinish the song: In West Philadelphia born and raised \n");
//        //Use next line to print full sentence, otherwise next will just print the first word
//        String sentence = userInput.nextLine();
//        System.out.println(sentence);

        System.out.println("Enter the length of the codeup classrom");
        int codeupLength = parseInt(userInput.nextLine());

        System.out.println("Enter the width of the codeup classroom");
        int codeupWidth = parseInt(userInput.nextLine());

        int codeupPerimeter = (2*codeupLength) + (2*codeupWidth);
        System.out.println("The perimeter is:" + codeupPerimeter);



    }
}



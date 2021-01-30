import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }
    public static double divide(double num1, double num2) {
        return num1 / num2;
    }
    public static double modulus(double num1, double num2) {
        return num1 % num2;
    }

    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            System.out.println("Not a number!");
            return getInteger(min, max);
        }
        int userInput = sc.nextInt();
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.println("Number not in range!");
            return getInteger(min, max);
        }
    }

    public static long calculateFactorial(int num) {
        int output = 1;
        for (int i = 1; i <= num; i += 1) {
            output *= i;
        }
        return output;
    }

    public static void userInteractionFactorial(Scanner sc) {
        boolean willContinue;
        String userChoice;
        do {
            System.out.println("Please enter an integer from 1 to 12");
            int userInt = getInteger(1, 12);
            System.out.println(calculateFactorial(userInt));
            do {
                System.out.println("Do you wish to continue? [y/n]: ");
                userChoice = sc.next().trim();
            } while (!userChoice.equalsIgnoreCase("y") & !userChoice.equalsIgnoreCase("n"));

            willContinue = userChoice.equalsIgnoreCase("y");
        } while (willContinue);
    }

    public static int randomWithRange(int min, int max)
    {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }

    public static void rollDiceGame(Scanner sc) {
        String userChoice;
        System.out.print("Please enter the number of sides for the dice: ");
        int nSides = getInteger(1, 20);
        do {
            System.out.println("You have rolled a " + randomWithRange(1, nSides) + " and a " + randomWithRange(1, nSides));
            do {
                System.out.println("Would you like to roll again? [y/n]");
                userChoice = sc.next().trim();
            } while (!userChoice.equalsIgnoreCase("y") & !userChoice.equalsIgnoreCase("n"));

        } while (!userChoice.equals("n"));
    }
}

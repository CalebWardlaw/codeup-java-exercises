import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;
        while (i <= 15) {
            System.out.println(i);
            i++;
        }

//        int counter = 0;
//        do {
//            System.out.println(counter);
//            counter += 2;
//        }   while(counter <= 100);
//
        int start = 0;
        while (start <= 100) {
            start++;
            if (start % 15 == 0) {
                System.out.println(start + " Fizzbuzz");
            } else if (start % 5 == 0) {
                System.out.println(start + " Buzz");
            } else if (start % 3 == 0) {
                System.out.println(start + " Fizz");
            } else {
                System.out.println(start);
            }
        }

        Scanner sc = new Scanner(System.in);

        boolean userContinues = true;

        do {
            System.out.println("\nWhat number would you like to go up to?\n");
            int userInt = sc.nextInt();
            //Below - just used for spacing
            System.out.println();
            System.out.println("Here is your table!");
            System.out.println();
            System.out.println("Number | Squared | Cubed");
            System.out.println("------ | ------- | -----");
            for (i = 1; i <= userInt; i +=1){
                System.out.format("%-7d", i);
                System.out.print("|");
                System.out.format(" %-8d", i * i);
                System.out.print("|");
                System.out.format(" %-9d", i*i*i);
                System.out.println();
            }
        System.out.print("\nWould you like to enter another number (y/n)?\n");
            String userResponse = sc.next();
            if(!userResponse.equalsIgnoreCase("y")){
                userContinues=false;
            }
        } while (userContinues);
    }
}

import java.util.Scanner;

public class Bob {
    public static void main(String[] args){

        Scanner user = new Scanner(System.in);


        String sure = "Sure.";
        String chill = "Woah, chill out!";
        String fine = "Fine be that way!";
        String whatever = "Whatever.";
        String bob = "";

        bob = user.nextLine();


        if (bob.endsWith("?")) {
            System.out.println(sure);
        }
        else if (bob.endsWith("!")) {
            System.out.println(chill);
        }
        else if (bob.equals("")) {
            System.out.println(fine);
        }
        else {
            System.out.println(whatever);
        }



//        System.out.println(adultQuestion);
//        if (adultQuestion.endsWith("?")){
//            System.out.println("Sure");
//        }
//
//        String adultExclaim = "Lets eat my man!";
//        System.out.println(adultExclaim);
//        if (adultExclaim.endsWith("!")) {
//            System.out.println("Whoa, chill out!");
//        }

    }

//        System.out.println("Would you like something to eat?");
//
//        if (.endsWith("?")){
//
//        }
//
//        bob.nextLine();
//
//        System.out.println("Lets eat!");
//
//        bob.nextLine();
//
//        System.out.println("");
//
//        bob.nextLine();

        //Whatever

}

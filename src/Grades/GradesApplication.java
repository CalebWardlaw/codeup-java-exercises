package Grades;

import util.Input;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class GradesApplication {
    public static void main(String[] args) {
        initialize();
    }

    public static void initialize() {
        Map<String, Student> students = getStudents();
        System.out.println("Welcome!");
        Input in = new Input();

        do {
            // this should be broken into multiple method calls
            System.out.println("\nHere are the GitHub usernames of our students:\n");
            System.out.println(listStudents(students) + "\n");
            String userChoice = in.getString("What student would you like to see more information on?\n");
            System.out.println();
            if (students.containsKey(userChoice)) {
                System.out.println(listStudentInfo(students.get(userChoice), userChoice));
            } else {
                System.out.println("Sorry, no student found with the GitHub username of " + userChoice + ".");
            }
            System.out.println();
        } while (in.yesNo("Would you like to see another student (type yes or no)?\n"));
    }

}


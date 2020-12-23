package Grades;

import collections.HashMaps;
import util.Input;

import java.util.HashMap;
import java.util.Map;


public class GradesApplication {
    public static void main(String[] args){
        initialize();
    }

public static Map<String, String> getStudents(){
    Map<String, String> Students = new HashMap<String, String>();

    Student s1 = new Student("Caleb");
    s1.addGrade(95);
    s1.addGrade(80);
    s1.addGrade(85);

    return Students;

}
}

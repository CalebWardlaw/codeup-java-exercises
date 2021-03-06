package Grades;
import java.util.ArrayList;


public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName(){
    return name;
    };

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public double getGradeAverage(){
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return (double) total / grades.size();
    }



    public static void main(String[]args){
        Student Caleb = new Student("Caleb");
        Caleb.addGrade(95);
        Caleb.addGrade(99);
        System.out.println(Caleb.getGradeAverage());

    }
}

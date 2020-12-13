import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson(Person[] persons, Person addedPerson) {

        Person [result] = Arrays.copyof(persons, person.length +1);

        result[3] = new Person(addedPerson.getName());

        return result;
    }
    public static void main(String[] args){

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        //Array.toString required, else it would print memory ID


        //Creating new array
        Person[] persons = new Person[3];

        //Objects for Array
        Person caleb = new Person("Caleb");
        Person josh = new Person("Josh");
        Person zek = new Person("Zek");

        persons[0] = caleb;
        persons[1] = josh;
        persons[2] = zek;

        Person jeff = new Person("Jeff");
        addPerson(persons, jeff);

    }



}




    /*
Create a static method named addPerson. It should accept an array of Person objects,
as well as a single person object to add to the passed array.
It should return an array whose length is 1 greater than the passed array,
with the passed person object at the end of the array.*/



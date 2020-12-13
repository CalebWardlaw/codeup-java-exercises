import java.util.Arrays;

public class ArraysExercises {

    public static person[] addPerson(person[] persons, person addedPerson){
        person[] result = Arrays.copyOf(persons, persons.length + 1);

        result[3] = new person(addedPerson.getName());

        return result;
    }

    public static void main(String[] args){

        person[] persons = new person[3];

        person caleb = new person("Caleb");
        person josh = new person("Josh");
        person zek = new person("Zek");

        persons[0] = caleb;
        persons[1] = josh;
        persons[2] = zek;

        person jeff = new person("Jeff");
        addPerson(persons, jeff);



    }


}




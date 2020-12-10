public class person {
    private String name;

    public String getName(){
        return String.format("name: %s", name);
    }

    //Void means it won't return a value
    public void setName(String name){
        this.name=name;
    }

    //The class should have a constructor that accepts a `String` value and sets
    //the person's name to the passed string.
    public person(String personName){
        name = personName;
    }

    public void sayHello(){

    }

    //Create a `main` method on the class that creates a new `Person` object and
    //tests the above methods.

    public static void main(String[] args){
        person test = new person("Caleb");
        //expecting Caleb
        System.out.println(test.name);
        //Expecting true, then false due to improper comparison
//    person person1 = new person("John");
//    person person2 = new person("John");
//    System.out.println(person1.getName().equals(person2.getName()));
//    System.out.println(person1 == person2);

        //Expecting false, improper comparison, returned true
//        person person1 = new person("John");
//        person person2 = person1;
//        System.out.println(person1 == person2);

        //Expecting to return John, Jane, returned John only
//        person person1 = new person("John");
//        person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        //Will continue the change throughout
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
    }
}

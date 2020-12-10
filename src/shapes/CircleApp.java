package shapes;
import util.Input;



public class CircleApp {
    public static void main(String[]args){

        //Creating a new input for use
        Input input = new Input();
        //Calling getDouble from Input class
        double radius = input.getDouble();
        //Ensuring user entered data is stored
        System.out.println(radius);
    }
}

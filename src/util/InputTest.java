package util;

public class InputTest {
    public static void main(String[]args){
        //Need to call input
        Input test = new Input();
        System.out.println(test.getString());
        System.out.println(test.getInt(5,10));
        System.out.println(test.getInt());
    }
}

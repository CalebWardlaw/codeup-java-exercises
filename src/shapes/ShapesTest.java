package shapes;

public class ShapesTest {
    public static void main(String[] args){
        Rectangle box1 = new Rectangle(5,4);

        Rectangle box2 = new Square(5);

        Measurable myShape;
        myShape = (Measurable) box1;

        System.out.println(myShape.getPerimeter());
    }
}

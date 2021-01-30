package shapes;

import org.w3c.dom.ls.LSOutput;

public class Rectangle {

    //Initiate
    protected double length;
    protected double width;
    //Construct

    public Rectangle(double l, double w){
//    this.length = length;
//    this.width = width;
        super(l, w);
    }
    //Perimeter

    public double getArea() {
        return length * width;
    }

    public double getPerimeter(){
        return ((length * 2) + (width * 2));
    }

    public void setLength(double length){
        this.length = length;
    }

    public void setWidth(double width){
        this.width = width;
    }









    public double getPerimeter(){
        double perimeter =  (2 * length) + (2 * width);
        System.out.println("Calculating perimeter\n");
        return perimeter;
    }

    public double getArea(){
        double area = length*width;
        System.out.println("Calculating area\n");
        return area;
    }

//    Inside of your shapes directory, create a class named Rectangle. It should have protected
//     properties for both length and width. Rectangle should define a constructor that
//     accepts two numbers for length and width, and sets those properties.



}

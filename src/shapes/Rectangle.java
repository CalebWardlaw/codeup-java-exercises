package shapes;



public class Rectangle extends Quadrilateral implements Measurable {

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
}

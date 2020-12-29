package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    //Props
    protected double length;
    protected double width;

    //Constructor
    public Quadrilateral(double length, double width) {
        //set properties
        this.length = length;
        this.width = width;
    }


    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

    //Getters
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    //Setters
    public abstract void setLength(double length);

    public abstract void setWidth(double width);
}
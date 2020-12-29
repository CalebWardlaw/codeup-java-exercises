package shapes;

public class Square extends Rectangle{
    //Must call parent constructor using super, implemented by IDE
    public Square(double side) {
        super(side, side);
    }

    public double getArea(){
        System.out.println("Calculating square area:");
        return length * length;
    }

    public double getPerimeter(){
        System.out.println("Calculating square perimeter");
        return 4*length;
    }

    public void setWidth(double width){
        this.width = width;
        this.length = width;
    }

    public void setLength(double length){
        this.width = length;
        this.length = length;
    }

}

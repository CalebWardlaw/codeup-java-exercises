package shapes;

public class Circle {
    //use double for the decimals

    //Inside of src, create a directory named shapes. Inside of shapes, create a class named Circle.
    // This class should have a private radius property that is set through the constructor,
    // and various methods for getting information about the circle, detailed below.

//    private double radius;

    //radius times two formula
//    public Circle(double radius){
//        this.radius = radius;
//    }

//    //Use area formula
//    public double getArea(){
//        System.out.println("Should return circle area");
//    }
//
//    //Use circumference formula
//    public double getCircumference(){
//
//    }

    private double radius;
    private static int circleCount = 0;

    public Circle(double rad){
        this.radius = rad;
        circleCount++;
    }

    public double getArea(){
        return Math.PI * (Math.pow(radius,2));
    }
    public double getCircumference(){
        return 2 * Math.PI * radius;
    }

    public static int getCircleCount(){
        return circleCount;
    }

}

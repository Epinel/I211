public class Exercise12_5 {
    public static void main(String[] args) {
        try {
            TriangleWithException t1 = new TriangleWithException(1.5,2,3);
        System.out.println("Perimeter for triangle: "+t1.getPerimeter());
        System.out.println("Area for triangle: "+t1.getArea());

        TriangleWithException t2 = new TriangleWithException(1,2,3);
        System.out.println("Perimeter for triangle: "+t2.getPerimeter());
        System.out.println("Area for triangle: "+t2.getArea());


            
        } catch (IllegalTriangleException e) {
            System.out.println("Illegal triangle");
            System.out.println("Side1: "+e.getSide1());
            System.out.println("Side2: "+e.getSide2());
            System.out.println("Side3: "+e.getSide3());
        }
    }
}

class IllegalTriangleException extends Exception {
    private double side1, side2, side3;

    public IllegalTriangleException (double side1, double side2, double side3, String s) {
        super(s);
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }

    public double getSide1() {
        return side1;
    }
    public double getSide2() {
        return side2;
    }
    public double getSide3() {
        return side3;
    }
}

class TriangleWithException extends Object {
    double side1,side2,side3;

    public TriangleWithException(double side1, double side2, double side3)
        throws IllegalTriangleException {
            this.side1=side1;
            this.side2=side2;
            this.side3=side3;
            if (side1+side2<=side3||side1+side3<=side2||side2+side3<=side1)
            throw new IllegalTriangleException(side1, side2,side3,"The sum of any two sides is greater than the third side");

        }

        public double getArea(){
        double s = (side1+side2+side3)/2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
}

public double getPerimeter(){
    return side1+side2+side3;
}

@Override
public String toString() {
    return "Triangle: side1 = "+side1+"side2 = "+side2+"side3 = "+side3;
}
}

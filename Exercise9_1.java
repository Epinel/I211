public class Exercise9_1 {
    public static void main(String[] args) {
        MyRectangle rectangle1 = new MyRectangle(4,40);
        System.out.println("The area of a rectangle with width "+rectangle1.width+" and height "+rectangle1.height+" is "+rectangle1.getArea());
        System.out.println("The perimeter is "+rectangle1.getPerimeter());

        MyRectangle rectangle2 = new MyRectangle(3.5,35.9);
         System.out.println("The area of a rectangle with width "+rectangle2.width+" and height "+rectangle2.height+" is "+rectangle2.getArea());
        System.out.println("The perimeter is "+rectangle2.getPerimeter());

    }
}

class MyRectangle {
    double width=1;
    double height=1;


public MyRectangle(){
}

public MyRectangle(double newWidth, double newHeight){
    width=newWidth;
    height=newHeight;
}

public double getArea(){
    return width*height;
}

public double getPerimeter() {
    return 2*(width+height);
}
}

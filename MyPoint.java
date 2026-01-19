public class MyPoint{
    //data field
    private double xCoordinate;
    private double yCoordinate;

    //create (0,0)
    public MyPoint(){
        this.xCoordinate=0;
        this.yCoordinate=0;
    }

    //specified coordinates
    public MyPoint(double x, double y){
        this.xCoordinate=x;
        this.yCoordinate=y;
    }

    //getter method
    public double getX(){
        return xCoordinate;
    }

    public double getY(){
        return yCoordinate;
    }

    //calculate distance to another MyPoint object
    public double distance(MyPoint other){
         double dx=this.xCoordinate-other.xCoordinate;
         double dy=this.yCoordinate-other.yCoordinate;

         return Math.sqrt(dx*dx+dy*dy);
    }

    //distance to specified x and y coordinates

    public double distance(double x, double y){
        double dx=this.xCoordinate-x;
        double dy=this.yCoordinate-y;

        return Math.sqrt(dx*dx+dy*dy);
    }

    //static method between two MyPoint objects

    public static double distance (MyPoint p1, MyPoint p2){
        double dx = p1.xCoordinate-p2.xCoordinate;
        double dy=p1.yCoordinate-p2.yCoordinate;
        return Math.sqrt(dx*dx+dy*dy);
    }

}

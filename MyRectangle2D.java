public class MyRectangle2D {
    //data fields
    private double x;
    private double y;
    private double width;
    private double height;


    //default rectangle

    public MyRectangle2D(){
        this.x=0;
        this.y=0;
        this.width=1;
        this.height=1;
    }

    //specified rectangle
    public MyRectangle2D(double x, double y, double width, double height){
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
    }

    //getters
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }

    //setters
    public void setX(double x){
        this.x=x;
    }
    public void setY(double y){
        this.y=y;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public void setHeight(double height){
        this.height=height;
    }

    //getArea
    public double getArea(){
        return width*height;
    }

    //get perimeter
    public double getPerimeter(){
        return 2*(width+height);
    }

    public boolean contains(double x, double y){
        double left = this.x-width/2;
        double right = this.x+width/2;
        double top = this.y+height/2;
        double bottom = this.y-height/2;

        return x>=left && x<=right && y>=bottom && y<=top;
    }

    public boolean contains(MyRectangle2D r){
        double left = this.x-width/2;
        double right = this.x+width/2;
        double top = this.y+height/2;
        double bottom = this.y-height/2;

        double rleft = r.x-r.width/2;
        double rright = r.x+r.width/2;
        double rtop = r.y+r.height/2;
        double rbottom = r.y-r.height/2;

        return rleft>=left && rright<=right && rtop<=top && rbottom>=bottom;
    }

    public boolean overlaps(MyRectangle2D r){
         double left = this.x-width/2;
        double right = this.x+width/2;
        double top = this.y+height/2;
        double bottom = this.y-height/2;

        double rleft = r.x-r.width/2;
        double rright = r.x+r.width/2;
        double rtop = r.y+r.height/2;
        double rbottom = r.y-r.height/2;

        if(rright<=left||rleft>=right||rtop<=bottom||rbottom>=top){
            return false;
    }

    return true;
}
}

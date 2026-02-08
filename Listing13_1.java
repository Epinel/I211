public abstract class Listing13_1 {

    //set initial color
    private String color = "white";

    //is it filled?
    private boolean filled;

    //when was it made?
    private java.util.Date dateCreated;

    //default geometric object
    protected Listing13_1() {
        dateCreated = new java.util.Date();
    }

    //geometric object with color and filled value
    protected Listing13_1(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color; //color can be replaced with string
        this.filled = filled;
    }

    //return color
    public String getColor() {
        return color;
    }

    //set a new color
    public void setColor(String color) {
        this.color = color; //color can be new String
    }

    //return filled
    public boolean isFilled() {
        return filled;
    }

    //set new fill
    public void setFilled(boolean filled){
        this.filled=filled;
    }

    //get date created
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString(){
        return "created on "+dateCreated+"\ncolor: "+color+" and filled: "+filled;
    }

    //Abstract get area
    public abstract double getArea();

    //Abstract get perimeter
    public abstract double getPerimeter();
}

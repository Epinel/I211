
public class Complex implements Cloneable, Comparable<Complex>{

private double a; //real part
private double b; //imaginary part

public Complex(double a, double b){
    this.a = a;
    this.b = b;
}

public Complex(double a){
    this(a,0);
}

public Complex(){
    this(0,0);
}

//get parts
public double getRealPart(){
    return a;
}
public double getImaginaryPart(){
    return b;
}

//operations
public Complex add(Complex other){
    return new Complex(this.a + other.a, this.b + other.b);
}

public Complex subtract(Complex other){
    return new Complex(this.a - other.a, this.b - other.b);
}

public Complex multiply(Complex other){
    return new Complex(this.a*other.a - this.b*other.b, this.b*other.a + this.a*other.b);
}

public Complex divide(Complex other){
    return new Complex((this.a*other.a+this.b*other.b)/(other.a*other.a+other.b*other.b),(this.b*other.a-this.a*other.b)/(other.a*other.a+other.b*other.b));
}

public double abs() {
    return Math.sqrt(a*a+b*b);
}

@Override

public int compareTo(Complex other){
    return Double.compare(this.abs(),other.abs());
}


 @Override
public String toString() {
    if (b == 0) {
            return String.valueOf(a);
        } else if (b > 0) {
            return a + " + " + b + "i";
        } else {
            return a + " - " + (-b) + "i";
        }
    }
}

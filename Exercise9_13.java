import java.util.Scanner;
public class Exercise9_13{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns of the array: ");
        int numberRows = input.nextInt();
        int numberColumns=input.nextInt();

        double[][] a = new double[numberRows][numberColumns];

        System.out.println("Enter the array: ");
        for (int i=0;i<a.length;i++)
            for (int j=0;j<a[i].length;j++)
            a[i][j]=input.nextDouble();

        Location location = locateLargest(a);
        System.out.println("The largest element is "+location.maxValue+", located at ("+location.row+","+location.column+")"); 
    }
    public static Location locateLargest(double[][] a){
        Location location = new Location();

        location.maxValue=a[0][0];
        for (int i=0;i<a.length;i++)
        for (int j=0;j<a[i].length;j++){
            if (location.maxValue<a[i][j]){
                location.maxValue=a[i][j];
                location.row=i;
                location.column=j;
            }
        }
        return location;
    }
}



class Location{
    public int row;
    public int column;
    public double maxValue;
}

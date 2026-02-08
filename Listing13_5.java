//finds the largest number in a list of Number objects
import java.math.*;
import java.util.ArrayList;
public class Listing13_5 {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>(); //initialize a new list

        list.add(45); //add an integer
        list.add(3445.53); //add a double
        list.add(new BigInteger ("1473934923954783496"));
        list.add(new BigDecimal("2.459357934759387"));

        System.out.println("The largest number is "+getLargestNumber(list));
    }
    
    //method for get largest number
    public static Number getLargestNumber(ArrayList<Number> list) {
        if (list==null || list.size()==0)
        return null;

    Number number=list.get(0);
        for (int i=1; i<list.size(); i++)
            if (number.doubleValue() < list.get(i).doubleValue())
                number = list.get(i);

        return number;

    }
    }

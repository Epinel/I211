//sorts an array of strings and BigInteger objects
import java.math.*;

public class Listing13_8 {
    public static void main(String[] args) {
        String[] cities = {"Savannah", "Boston","Atlanta","Tampa"};
        
        java.util.Arrays.sort(cities);
        for (String city: cities)
            System.out.print(city+" ");
            System.out.println();

        BigInteger[] hugeNumbers = {new BigInteger("28937595794859"),
        new BigInteger("483579247592579"),
        new BigInteger("24057045045034")};

        java.util.Arrays.sort(hugeNumbers);
        for (BigInteger number:hugeNumbers)
            System.out.print(number+" ");

    
    }
}

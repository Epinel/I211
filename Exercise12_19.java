import java.net.URL;
import java.util.Scanner;

public class Exercise12_19 {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://liveexample.pearsoncmg.com/data/Lincoln.txt");

        Scanner input = new Scanner(url.openStream());
        int total = 0;

        while (input.hasNext()){
            String line = input.nextLine();
            total += getNumberofWords(line);
        }
        System.out.println("The total number of words is "+total);
    }
    public static int getNumberofWords(String s){
        String[] tokens = s.split("[\\s\\p{P}]");

        int count = 0;

        for (String token: tokens){
            if (token.trim().length()>0){
                count++;
            }
        }
        return count;
    }
}

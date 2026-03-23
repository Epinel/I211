
import java.util.*;

public class Exercise21_4 {
    public static void main(String[] args) throws Exception {
        HashSet<Character> set1 = new HashSet<>(Arrays.asList(
            new Character[]{'A','E','I','O','U'}
        ));

        System.out.print("Enter a file name: ");
        Scanner input = new Scanner(System.in);
        String filename = input.nextLine();

        input = new Scanner(new java.io.File(filename));

        int Vowels = 0;
        int Consonants = 0;

        while (input.hasNext()){
            String s = input.nextLine().toUpperCase();

            for (int i=0; i<s.length(); i++){
                if (set1.contains(s.charAt(i)))
                Vowels++;
            else if (Character.isLetter(s.charAt(i)))
                Consonants++;
            }

        }

        System.out.println("The number of vowels is "+Vowels+" and consonants is "+Consonants);

    }
}

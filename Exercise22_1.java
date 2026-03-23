import java.util.Scanner;

public class Exercise22_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        System.out.println("Maximum consecutive substring is "+maxConsecutiveSortedSubstring(s));
    }

    public static String maxConsecutiveSortedSubstring (String s){
        int[] maxConsecutiveLength = new int[s.length()];
        int current = 0;
        for (int i =1; i<s.length(); i++){
            if(s.charAt(i)<=s.charAt(i-1)){
                current=i;
            } else {
                for (int j=i-1;j>=current;j--)
                maxConsecutiveLength[j]++;
            }
        }

        int currentMaxLength = maxConsecutiveLength[0];
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (maxConsecutiveLength[i]>currentMaxLength){
                currentMaxLength = maxConsecutiveLength[i];
                index = i;
            }
        }
        return s.substring(index, index+currentMaxLength+1);
    }

    public static String maxConsecutiveSortedSubstring1(String s){
        int currentMaxLength = 1;
        int lastIndexOfMaxConsecutiveSortedSubstring = 0;
        int maxLength = 1;
        int lastIndexOfCurrentMaxConsecutiveSortedSubstring = 0;

        for(int i =1; i<s.length(); i++){
            if (s.charAt(i)>s.charAt(i-1)){
                currentMaxLength++;
            }
            else {
                if (maxLength<currentMaxLength){
                    maxLength = currentMaxLength;
                    lastIndexOfMaxConsecutiveSortedSubstring = i;
                }
                currentMaxLength = 1;
            }
        }
        if (maxLength<currentMaxLength){
            maxLength = currentMaxLength;
            lastIndexOfMaxConsecutiveSortedSubstring = s.length();
            
            lastIndexOfMaxConsecutiveSortedSubstring = s.length();

        }
        return s.substring(lastIndexOfMaxConsecutiveSortedSubstring - maxLength, lastIndexOfMaxConsecutiveSortedSubstring);
    }
}

import java.util.Scanner;

public class Exercise18_9{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String line = input.nextLine();
        System.out.print("The reversal of "+line+" is ");
        reverseDisplay(line);
    }

    public static void reverseDisplay(String value) {
        if (value.length()>0){
            System.out.print(value.charAt(value.length()-1));
            reverseDisplay(value.substring(0,value.length()-1));
        }
    }
}

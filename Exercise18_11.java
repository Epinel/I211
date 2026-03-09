import java.util.Scanner;

public class Exercise18_11{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer");
        int i = input.nextInt();
        System.out.print("The sum of the digits in "+i+" is "+sumDigits(i));
        
    
    }
    public static int sumDigits(long num){
        int result = 0;

        if (num!=0){
            result = sumDigits(num/10)+(int)(num%10);
        }
        return result;
    }
}

import java.util.Scanner;

public class Exercise18_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        System.out.println("The GCD of "+num1+" and "+num2+" is "+gcd(num1,num2));
    }

    public static int gcd(int num1, int num2){
        if(num1%num2==0)
            return num2;
        else 
            return gcd(num2, num1%num2);
    }
}

import java.util.*;

public class Exercise21_15 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        int num1 = (int)(Math.random()*10);
        int num2 = (int)(Math.random()*10);

        Scanner input = new Scanner(System.in);
        System.out.print("What is "+num1+ " + "+num2+"? ");
        int answer = input.nextInt();

        set.add(answer);

        while (num1+num2!= answer){
            System.out.print("Wrong. Try again. What is "+num1+ " + "+num2+"? ");
            answer = input.nextInt();

            if(set.contains(answer)){
            System.out.println("You already entered " + answer);
            } else {
            set.add(answer);
            }
        }
        System.out.println("You got it!");
    }
}

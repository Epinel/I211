import java.util.ArrayList; 
import java.util.Random;
import java.util.Scanner;

public class Exercise11_7{
    public static void shuffle(ArrayList<Integer> list){
        Random rand =new Random();

        for (int i=0;i<list.size();i++){
            int randomIndex = rand.nextInt(list.size());

            int temp = list.get(i);
            list.set(i, list.get(randomIndex));
            list.set(randomIndex, temp);
        }
    }

    public static void main(String[] args) {
         //create array
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        //prompt user to fill array
        System.out.println("Enter a sequence of numbers (enter 0 to terminate): ");

        while (true){
            int input = scanner.nextInt();
            if (input==0){
                break;
            }
            list.add(input);
        }
        System.out.println("Original list: "+list);

        shuffle(list); //call shuffle

        System.out.println("Shuffled list: "+list);
    }
}

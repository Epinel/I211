//shuffles an ArrayList of numbers

 import java.util.ArrayList;
import java.util.Random;

public class Exercise13_2 {

    public static void main(String[] args) {
       
        ArrayList<Number> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2.5);
        numbers.add(3);
        numbers.add(4.75);
        numbers.add(5);

        System.out.println("Before shuffle: " + numbers);

        shuffle(numbers);

        System.out.println("After shuffle: " + numbers);
    }

    public static void shuffle(ArrayList<Number> list) {
        Random rand = new Random();

        for (int i = list.size() - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);

            Number temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
    }
}


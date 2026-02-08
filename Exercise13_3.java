import java.util.ArrayList;

public class Exercise13_3 {

    public static void main(String[] args) {
        
        ArrayList<Number> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(2.5);
        numbers.add(9);
        numbers.add(1.2);
        numbers.add(6);

        System.out.println("Before sort: " + numbers);

    
        sort(numbers);

        System.out.println("After sort: " + numbers);
    }

    public static void sort(ArrayList<Number> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).doubleValue() < list.get(minIndex).doubleValue()) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                Number temp = list.get(i);
                list.set(i, list.get(minIndex));
                list.set(minIndex, temp);
            }
        }
    }
}

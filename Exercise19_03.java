import java.util.ArrayList;

public class Exercise19_03 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(14);
        list.add(24);
        list.add(14);
        list.add(42);
        list.add(25);

        ArrayList<Integer> newList = removeDuplicates(list);

        System.out.print(newList);
    }

    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        ArrayList<E> result = new ArrayList<E>();

        list.stream().filter((e)->(!result.contains(e))).forEachOrdered((e)->{
            result.add(e);
        });

        return result;
    }
}

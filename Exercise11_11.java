import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_11{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter 5 numbers: ");
        for (int i=0;i<5;i++){
            list.add(input.nextInt());
        }

        sort(list);

        System.out.println("Numbers in increasing order: "+list);
    }

    public static void sort(ArrayList<Integer> list){
        for (int i=0; i<list.size()-1;i++){
            int minIndex=i;
            
            for (int j=i+1;j<list.size();j++){
                if(list.get(j)<list.get(minIndex)){
                    minIndex=j;
                }
            }

            int temp = list.get(i);
            list.set(i, list.get(minIndex));
            list.set(minIndex, temp);
        }
    }
}

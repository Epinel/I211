import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_4{

public static Integer max(ArrayList<Integer> list){
            if (list == null || list.isEmpty()){
                return null;
            }
            
            int maxValue = list.get(0);

            for (int num : list){
                if (num>maxValue){
                    maxValue = num;
                }
            }
            return maxValue;
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
        
        Integer largest = max(list);

        if (largest != null){
            System.out.println("The largest number entered is: "+largest);
        } else {
            System.out.println("No numbers were entered.");
        }
        
    }
} 

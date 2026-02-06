import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12_33{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a URL to search: ");
        String url = input.nextLine();

        System.out.print("Enter a word to search: ");
        String word = input.nextLine();

        crawler(url,word);
    }

    public static void crawler(String startURL, String word){
        ArrayList<String> listOfPendingURLs = new ArrayList<String>();
        ArrayList<String> listOfTraversedURLs = new ArrayList<String>();

        listOfPendingURLs.add(startURL);
        while(!listOfPendingURLs.isEmpty()&&listOfTraversedURLs.size()<=100) {
            String urlString = listOfPendingURLs.remove(0);

            if(!listOfTraversedURLs.contains(urlString)){
                listOfTraversedURLs.add(urlString);
                System.out.println("Crawl "+urlString);

                if (contains(urlString, word)){
                    System.out.println("The URL "+urlString+" contains the word "+word);
                    System.out.println("The number of pages searched is "+listOfTraversedURLs.size());
                    break;
                }

                for (String s: getSubURLs(urlString)){
                    if (!listOfTraversedURLs.contains(s))
                    listOfPendingURLs.add(s);
                }
            }

        }
    }

    public static boolean contains(String urlString, String word) {
        try {
            java.net.URL url = new java.net.URL(urlString);

            try (Scanner input = new Scanner(url.openStream())){
                while (input.hasNext()){
                    String line = input.nextLine();
                    if(line.indexOf(word)>0)
                    return true;
                }
            }
            
        } 
        catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
        return false;
    }

    public static ArrayList<String> getSubURLs(String urlString){
        ArrayList<String> list = new ArrayList<String>();

        try {
            java.net.URL url = new java.net.URL(urlString);
            try (Scanner input = new Scanner(url.openStream())){
                int current = 0;
                while (input.hasNext()){
                    String line = input.nextLine();
                    current = line.indexOf("http:",current);
                    while (current>0){
                        int endIndex = line.indexOf("\"", current);
                        if(endIndex>0){
                            list.add(line.substring(current,endIndex));
                            current = line.indexOf("http:",endIndex);
                        }
                        else
                        current = -1;
                    }
                }
            }
        } 
        catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
        return list;
    }
}

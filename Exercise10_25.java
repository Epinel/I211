import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise10_25{
    public static Sting[] split(String s, String regex){
        ArrayList<string> parts = new ArrayList<>();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);

        int End = 0;

        while (matcher.find()){
            if (matcher.start()>End){
                parts.add(s.substring(End,matcher.start()));
            }
            parts.add(matcher.group());

            End=matcher.end();
        }

        if (End<s.length()){
            parts.add(s.substring(End));
        }

        return parts.toArray(new String[0]);
    }
}

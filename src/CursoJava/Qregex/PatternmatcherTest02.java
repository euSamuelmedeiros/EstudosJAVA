package CursoJava.Qregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternmatcherTest02 {
    public static void main(String[] args) {
        String regex = "ab";
        String tex = "abbabababa";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(tex);
        
        System.out.println(tex);
        System.out.println(regex);
        while (matcher.find()) {
            System.out.print(matcher.start() + " ");
        }

    }

}
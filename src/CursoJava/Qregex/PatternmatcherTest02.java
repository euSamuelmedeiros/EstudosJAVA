package CursoJava.Qregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternmatcherTest02 {
    public static void main(String[] args) {

        //    \\d todos os digitos
        //     \\D tudo o que nao for digito
        //     \\s espaços em branco
        //     \\S todos os caracteres excluindo espaços em branco
        //     \\w todos os digitos e letras da a-z
        //     \\W tudo oq nao for digito e letras

        String regex = "\\s";
        String tex = "AsdaA  LK!@#";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(tex);
        
        System.out.println(tex);
        System.out.println(regex);
        while (matcher.find()) {
            System.out.print(matcher.start() + " ");
        }

    }

}
package CursoJava.TResourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest02 {
    public static void main(String[] args) {
        String language = "en";

        Locale locale;
        if (language.equals("pt")) {
            locale = new Locale("pt", "BR");
        } else {
            locale = new Locale("en", "US");

        }

        ResourceBundle bundle = ResourceBundle.getBundle("messages", locale);
        System.out.println(bundle.getString("ola"));
        System.out.println(bundle.getString("Adeus"));















        /*
         * String languagem = "en";
         * 
         * Locale locale;
         * 
         * if (languagem.equals("pt")) {
         * locale = new Locale("pt", "BR");
         * } else {
         * locale = new Locale("en", "US");
         * 
         * }
         * ResourceBundle messages = ResourceBundle.getBundle("messages", locale);
         * System.out.println(messages.getString("ola"));
         * System.out.println(messages.getString("adeus"));
         * 
         */
    }

}

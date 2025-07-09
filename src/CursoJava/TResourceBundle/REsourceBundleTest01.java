package CursoJava.TResourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class REsourceBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle.getBundle("message", new Locale("pt", "BR"));
        
    }
}

package CursoJava.Qregex;



public class ScannerTest01 {
    public static void main(String[] args) {
        String txt = "samuel, pedro, muriloPote";   
        String[] nomes = txt.split(",");
        for (String name : nomes) {
            System.out.println(name.trim());
            
        }

    }
}

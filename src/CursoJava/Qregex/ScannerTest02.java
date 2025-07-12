package CursoJava.Qregex;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String txt = "samuel, pedro, muriloPote, 200, true";
        Scanner scanner = new Scanner(txt);
        scanner.useDelimiter(",\\s*");

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                System.out.println("int " + i);
            } else if (scanner.hasNextBoolean()) {
                boolean b = scanner.nextBoolean();
                System.out.println("boolean " + b);
            } else {
                String str = scanner.next();
                System.out.println("string " + str);
            }
        }

        scanner.close();
    }
}


package CursoJava.Qregex;

import java.util.Scanner;

public class TresinoToken01 {
    public static void main(String[] args) {
        String txt = "joao-23-true-ana-30-false-maria-45-true";
        Scanner scanner = new Scanner(txt);
        scanner.useDelimiter("-");

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                System.out.println("int " + i);
            } else if (scanner.hasNextBoolean()) {
                boolean b = scanner.nextBoolean();
                System.out.println("boolean " + b);

            } else {
                System.out.println("string: " + scanner.next());
            }

        }

    }
}

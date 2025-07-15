package CursoJava.WnioTest;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        Path p1 = Paths.get("C:\\Users\\Samuel\\Documents\\estudoss\\EstudosJAVA\\FIle.txt");
        Path p2 = Paths.get("C:\\Users\\Samuel\\Documents\\estudoss\\EstudosJAVA\\FIle.txt");
        Path p3 = Paths.get("C:\\Users\\Samuel\\Documents\\estudoss\\EstudosJAVA\\FIle.txt");
        Path p4 = Paths.get("C:\\Users\\Samuel\\Documents\\estudoss\\EstudosJAVA\\FIle.txt");
        System.out.println(p1.getFileName());
    }
}

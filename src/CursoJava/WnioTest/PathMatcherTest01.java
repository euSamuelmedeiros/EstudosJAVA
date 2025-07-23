package CursoJava.WnioTest;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatcherTest01 {
    public static void main(String[] args) {
        Path path1 = Paths.get("Pasta/subpasta/file.bkp");
        Path path2 = Paths.get("Pasta/subpasta/file.java");
        Path path3 = Paths.get("Pasta/subpasta/file.txt");

        matches(path1, "glob:*.bkp");
        matches(path1, "glob:**.bkp"); 
        matches(path2, "glob:**.{bkp,java}"); 
        matches(path3, "glob:**.{bkp,java,txt}"); 
    }

    private static void matches(Path path, String glob) {
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": " + matcher.matches(path));
    }
}

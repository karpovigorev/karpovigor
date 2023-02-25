package lesson2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Ex5 {
    public static void main(String[] args) {
        ex5("X:\\Ya.Disk\\work\\Lessons\\java-practic190123");

    }

    private static void ex5(String path) {
        StringBuilder sb = new StringBuilder();
        for (String fileName : convertPathToNamesArr(path)) {
            sb.append(fileName).append(System.lineSeparator());
        }

        try(PrintWriter pw = new PrintWriter("src/main/resources/lib/2ex5.txt")) {
            pw.print(sb);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static String[] convertPathToNamesArr(String path) {
        File dir = new File(path);
        return dir.list();
    }
}

import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.IOException;
public class urok2 {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Sample input: ");
            String str = in.next();
            System.out.print("Sample output: ");
            System.out.println(isPalindrome(str));
        }
        System.out.println("Задание 2");
        class FourthTask {
            public StringBuilder generateString() {
                StringBuilder stringBuilder = new StringBuilder();
                for (int i = 0; i < 100; i++) {
                    stringBuilder.append("TEST ");
                }
                return stringBuilder;
            }
            public void writer() {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream("test.txt");
                    fileOutputStream.write(generateString().toString().getBytes());
                    fileOutputStream.close();
                } catch (IOException e) {
                    System.out.println("Проблема вывода!");
                    e.printStackTrace();
                }
            }
        }
        FourthTask fourthTask = new FourthTask();
        fourthTask.writer();
        System.out.println("Файл test.txt успешно создан и записан 100 повторений TEST");
    }
    
    
    public static boolean isPalindrome(String text) {
        return text
            .replaceAll("\\W","")
            .equalsIgnoreCase(new StringBuilder(text
            .replaceAll("\\W",""))
            .reverse()
            .toString());
    }


}
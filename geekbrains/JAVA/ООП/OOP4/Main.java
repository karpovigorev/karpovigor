package OOP4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static <AddTask> void main(String[] args) throws IOException {

        // создал объект класса PrintPlaner
        // отвечает за форматированеи файла csv и вывод в консоль планера
        PrintPlaner printPlaner = new PrintPlaner();
        ArrayList<String> planer = printPlaner.planerArrayList();
        ArrayList<String[]> planerSplite = printPlaner.planerSplite(planer);

        // создал объект класса PrintTaskInPlaner
        // отвечает за вывод задач опередленного уровня
        PrintTaskInPlaner printTaskInPlaner = new PrintTaskInPlaner(planerSplite);

        // создал объект класса AddTask
        // отвечает за добавление задачи в csv файл
        AddTask addTask = new AddTask();

        // создал объект класса Talking
        // отвечает за прием данных от пользователя
        Talking ask = new Talking();

        try (Scanner in = new Scanner(System.in)) {
            // вывел на экран первый диалог
            ask.firstQuestion();

            // считал, что ввел пользователь
            int chois = in.nextInt();
            if (chois == 1) { // "1. Распечатать планер"
                printPlaner.printPlaner(planerSplite);
            } else if (chois == 2) { // "2. Вывести на экран задачи с определнным уровнем приоритета"

                // вопрос о том, какого уровня задачи нужн овывести
                ask.choisTask();
                int choisTask = in.nextInt();
                // запустил метод в классе PrintTaskInPlaner,
                // отвечающий за вывод зада определенного уровня
                printTaskInPlaner.printTask(choisTask);

            } else if (chois == 3) { // "3. Добавить задачу в планер"
                addTask.writeInPlaner();

            } else
                System.out.println("Выш выбор непонятен");
        }
    }
}
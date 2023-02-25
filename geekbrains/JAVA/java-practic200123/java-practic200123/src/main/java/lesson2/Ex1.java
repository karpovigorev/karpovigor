package lesson2;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
       bar();
    }

    private static void konstantin() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первую символ строки");
        String string1 = scan.next();
        System.out.println("Введите вторую символ строки");
        String string2 = scan.next();
        System.out.println("Длинна финальной строки");
        int repeat = scan.nextInt();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; builder.length() < repeat; i++){
            builder.append(string1).append(string2);
        }

        if (repeat % 2 != 0){
            builder.delete(builder.length() - 1, builder.length());
        }

        System.out.println(builder);

    }
    public static void concatMethod1 () {
        char a = charInput("Введите первый символ: ");
        char b = charInput("Введите второй символ: ");
        int strSize = userInput("Введите размер строки: ");

        StringBuilder sb = new StringBuilder();
        int counter = 0;
        while (counter < strSize) {
            sb.append(a);
            counter++;
            if (counter < strSize) {
                sb.append(b);
                counter++;
            }
        }
        System.out.println(sb);
    }

    private static int userInput(String msg) {
        Scanner sc = new Scanner(System.in);
        int inputStr;
        while (true) {
            System.out.print(msg);
            try {
                inputStr = Integer.parseInt(sc.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод! Введите целое число!");
            }
        }
        return inputStr;
    }

    private static char charInput(String msg) {
        Scanner sc = new Scanner(System.in);
        char inputChar;
        while (true) {
            System.out.print(msg);
            try {
                inputChar = sc.next().charAt(0);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод! Введите целое число!");
            }
        }
        return inputChar;
    }

    static void foo() {
        char firstChar = 'a';
        char secondChar = '_';
        int n = 5;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sb.append(firstChar);
            } else {
                sb.append(secondChar);
            }
        }

        System.out.println(sb);
    }

    static void bar() {
        char firstChar = 'a';
        char secondChar = '_';
        String firstSymbolString = String.valueOf(firstChar);
        String secondSymbolString = secondChar + "";
        int n = 5;

        if (n == 1) {
            System.out.println(firstSymbolString);
            System.exit(0);
        }

        String strResult = firstSymbolString
                .concat(secondSymbolString)
                .repeat(n / 2)
                .concat((n % 2 == 1) ? firstSymbolString : "");

/*        if (n % 2 == 1) {
            strResult += firstSymbolString;
        }*/

        System.out.println(strResult);
    }

}

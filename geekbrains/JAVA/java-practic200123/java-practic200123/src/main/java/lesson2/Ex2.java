package lesson2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
//        konstantin();
        concatMethod3();
    }

    private static void konstantin() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку для сжатия");
        String string1 = scan.next();
        StringBuilder builder = new StringBuilder();

        System.out.println();
        int counter = 1;
        char current = 0;
        char prev = 0;
        for (int i = 1; i < string1.length(); i++) {
            current = string1.charAt(i);
            prev = string1.charAt(i - 1);
            if (current != prev) {
                builder.append(prev).append((counter != 1) ? counter : "");
                counter = 0;
            }
            counter++;
        }
        builder.append(current).append((counter != 1) ? counter : "");

        System.out.println(builder);

    }

    public static void concatMethod3() {
        String str = "aaaabbbbcccccccccccccccccdfghjdddddddeeetttgh";
        StringBuilder sb = new StringBuilder();
        int counter = 1;
        char currChar = str.charAt(0);
        char nextChar = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            nextChar = str.charAt(i + 1);
            if (currChar != nextChar) {
                sb.append(currChar);

                if (counter > 1) {
                    sb.append(counter);
                }
                currChar = nextChar;
                counter = 0;
            }
            counter++;
        }
        sb.append(currChar);
        if (counter > 1) {
            sb.append(counter);
        }

        System.out.println(sb);
    }

}

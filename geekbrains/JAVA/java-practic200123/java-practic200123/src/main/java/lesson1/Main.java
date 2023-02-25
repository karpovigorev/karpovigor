package lesson1;

import java.io.BufferedReader;
import java.util.Random;
import java.util.Scanner;

//iApple -> appleCount
//lowerCamelCase - methods, vars
//UpperCamelCase - classes
//a, n, s, dfgdfgdfg
public class Main {
    public static void main(String[] args) {
        ex2();
        testMethod(new int[]{1, 3, 4, 5});
    }

    private static void ex2() {
        int[] arr = new int[1000];
        int counter = 0;
        int maxLength = 0;
        double n = Math.random(); //0 - 0.(9)
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
//            int num = arr[i];
            arr[i] = random.nextInt(2); //[0;2)
        }

        int[] arr2 = {0, 1, 0, 1, 1, 1};

        for (int num : arr2) {
            if (num == 1) {
                counter++;
            } else {
                /*if (counter > maxLength) {
                    maxLength = counter;
                }*/
                //(условие) ? (true) : (false)
//                maxLength = (counter > maxLength) ? counter : maxLength;
                counter = 0;
            }
            maxLength = Math.max(counter, maxLength);
        }
        System.out.println(maxLength);
    }

    public static void ex2_1() {
        int arr[] = {0, 0, 0, 0, 0, 0, 0};
        int counter = 0;
        int maxSequence = 0;
        for (int num : arr) {
            if (num == 1) {
                counter++;
                if (counter > maxSequence) {
                    maxSequence = counter;
                }
            } else {
                counter = 0;
            }
        }
        System.out.println(maxSequence);
    }

    static void testMethod (int[] arr) {

    }

}

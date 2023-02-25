import java.util.Random;
import java.util.ArrayList;
import static java.util.Collections.max;
import static java.util.Collections.min;

public class function {
    public static ArrayList<Integer> masrandom(ArrayList<Integer> list1, int number_random, int min_random, int max_random){
        Random rnd = new Random();
        for (int i = 0; i < number_random; i++) {
            int val = rnd.nextInt(min_random, max_random);
            list1.add(val);
        }
        return list1;
    }

    public static void remove_even(ArrayList<Integer> list1){
        int i = 0;
        while (i < list1.size()) {
            if (list1.get(i) % 2 == 0) {
                list1.remove(i);
            }
            else {
                i++;
            }
        }
    }
    public static void min_max_med(ArrayList<Integer> list1){
        int max = max(list1);
        int min = min(list1);
        int maxItem = list1.get(0);
        int minItem = list1.get(0);
        int sumItems = 0;
        for (int item : list1) {
            if (item > maxItem) {
                maxItem = item;
            }
            if (item < minItem) {
                minItem = item;
            }
            sumItems += item;
        }
        float average = (float)sumItems/list1.size();
        System.out.printf("Максимальный элемент при помощи max %s\n", max);
        System.out.printf("Максимальный элемент %s\n", maxItem);
        System.out.printf("Минимальный элемент при помощи min %s\n", min);
        System.out.printf("Минимальный элемент %s\n", minItem);
        System.out.printf("Сумма элементов %s\n", sumItems);
        System.out.printf("Среднее арифметическое %s\n", average);
    }

}

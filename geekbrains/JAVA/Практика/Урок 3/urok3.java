
import java.util.ArrayList;
public class urok3{
    public static void main(String[] args)
    {
        System.out.println("Задание 1:");
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        function.masrandom(list1 ,10, 1, 100);
        System.out.printf("Массив до очищения четных чисел: %s \n", list1);
        function.remove_even(list1);
        System.out.printf("Массив после очищения четных чисел:: %s \n", list1);
        System.out.println("Задание 2:");
        function.min_max_med(list1);
    }


}
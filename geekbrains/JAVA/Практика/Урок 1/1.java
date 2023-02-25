import java.util.Arrays;
import java.util.Collections;

class first {
   static int[] moveElementToEnd(int []array, int toMove)
   {
   int i = 0;
   int j = array.length - 1;
   while (i < j)
   {
      while (i < j && array[j] == toMove)
      j--;
      if (array[i] == toMove)
      swap(array, i, j);
      i++;
   }
   return array;
   }
   
   static int[] swap(int []arr, int i, int j)
   {
   int temp = arr[i];
   arr[i] = arr[j];
   arr[j] = temp;
   return arr;
   }
   public static void main(String[] args) {
      System.out.println("\nЗадание 1");
      Integer[] mas = {1, 5, 3, 8, 54, 6};
      int min = (int) Collections.min(Arrays.asList(mas));
      int max = (int) Collections.max(Arrays.asList(mas));
      System.out.println("Данные массива: " + Arrays.toString(mas)); //Display the string.
      System.out.println("Минимальное число: " + min);
      System.out.println("Максимальное число: " + max);
      
      System.out.println("\nЗадание 2");
      int g = 547;
      System.out.println("Год: " + g);
      if (g % 4 == 0) {
         if ((g % 100 != 0) || (g % 400 == 0)) {
            System.out.println("високосный");
         }
      }
      else {
         System.out.println("не високосный");
      }

      System.out.println("\nЗадание 3");
      int []nums = {3, 2, 2, 3};
      int var = 3;
      int []mas1 = moveElementToEnd(nums, var);
      for(int i = 0; i < nums.length; i++) {
         System.out.print(mas1[i] + " ");
      }
   }
}


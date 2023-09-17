import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;

class Answer {
    public static void analyzeNumbers(Integer[] arr) {
        // Введите свое решение ниже
        Set<Integer> arrayList = new TreeSet<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (int i=0; i<arr.length; i++){
            arrayList2.add(arr[i]);
        }
        Collections.sort(arrayList2);
        Integer min = arr[0];
        Integer max = arr[0];
        Integer sum = 0;
        for (int i=0; i<arr.length; i++){
            if (arr[i]<=min){
                min=arr[i];
            }
            else if (arr[i]>max){
                max = arr[i];
            }
        sum = sum+arr[i];
        arrayList.add(arr[i]);
        }

        System.out.println(arrayList2);
        System.out.println("Minimum is " + min);
        System.out.println("Maximum is " + max);
        System.out.println("Average is = " + sum/arr.length);
       
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{ 
    public static void main(String[] args) { 
      Integer[] arr = {};
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
      }
      else{
        arr = Arrays.stream(args[0].split(", "))
                        .map(Integer::parseInt)
                        .toArray(Integer[]::new);
      }     
      
      Answer ans = new Answer();      
      ans.analyzeNumbers(arr);
    }
}

/*Пусть дан произвольный список целых чисел, удалить из него чётные числа*/
import java.util.ArrayList;
import java.util.List;
public class Task_2 {
    public static void main(String[] args) {
        List<Integer> result = new ArrayList<>();
        int[] arr = {8, 12, 6, 3,4, 1, 15, 10, 35, 2};
        for (int i: arr) {
            if (i % 2 == 0) {
                result.add(i);
            }
        }
        System.out.println("List without even numbers: " + result);
    }

}

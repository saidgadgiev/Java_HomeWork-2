/*Реализовать алгоритм сортировки слиянием и выборкой.*/

// сортировка выборкой
import java.util.Arrays;

public class Task_1_Viborka {
    public static void main(String[] args) {
        int[] arr = {12, 6, 4, 1, 15, 10};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}

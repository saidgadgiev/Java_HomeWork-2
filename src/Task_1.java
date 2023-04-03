/*Реализовать алгоритм сортировки слиянием и выборкой.*/

// сортировка слиянием
import java.util.Arrays;

public class Task_1 {
    public void merge(int[] arr, int left, int srednee, int right) {
        int n1 = srednee - left + 1;
        int n2 = right - srednee;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; ++i) {
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            rightArray[j] = arr[srednee + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            }
            else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public void sort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            sort(arr, left, middle);
            sort(arr, middle + 1, right);
            merge(arr, left, middle, right);
        }
    }

    public static void main(String[] args) {
        int[] arr = {99, 12, 6, 55,4, 1, 15, 10, 35, 70};

        Task_1 mergeSort = new Task_1();
        mergeSort.sort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

}

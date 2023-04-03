/*Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.*/

import java.util.Arrays;
public class Task_3 {
    public static void main(String[] args) {
        int[] list = {8, 12, 6, 3, 4, 15, 10, 35, 2};
        Arrays.sort(list);

        int min = list[0];
        int max = list[list.length - 1];
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        double average = (double) sum / list.length;

        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее значение: " + average);
    }
}

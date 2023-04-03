/*Пусть дан произвольный список целых чисел, удалить из него чётные числа*/
public class Task_2 {
    public static void main(String[] args) {
        int[] arr = {8, 12, 6, 3,4, 1, 15, 10, 35, 2};
        for (int i: arr) {
            if (i % 2 == 0) System.out.printf(i + " ");


        }
    }

}

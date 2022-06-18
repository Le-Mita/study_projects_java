package Array;

/*
На вход подаётся последовательность целых чисел.
Создайте из этой последовательности массив чисел,
отсортированный по возрастанию, и выведите на печать.
 */

import java.util.Scanner;
import java.util.Arrays;

public class Task6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] arr = line.split(" ");
        int n = arr.length;
        int[] ett = new int[n];
        for (int i = 0; i < arr.length; i++) {
            ett[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(ett);
        System.out.print(Arrays.toString(ett));

    }
}

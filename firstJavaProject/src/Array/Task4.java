package Array;

/*
На вход подаётся целое число n > 1. Сформируйте массив
чётных чисел от 2 до n (включительно).
Выведите на печать массив в одной строке, через пробел.
Посчитайте и выведите на печать сумму элементов массива.
 */

import java.util.*;

public class Task4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        int[] num = new int[n / 2];

        int dl = num.length;

        for (int i = 0; i < dl; i++) {
            num[i] = (i + 1) * 2;
            sum = sum + num[i];
            System.out.print((i + 1) == num.length? num[i] + "\n" : num[i] + " ");
        }

        System.out.print(sum);

    }
}

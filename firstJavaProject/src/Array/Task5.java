package Array;

/*
На вход подаётся натуральное число n, затем несколько целых чисел,
разделённых пробелом, а на следующей строке - натуральное число k.
Выведите k-е по счёту число по возрастанию. Если такого числа нет,
выведите "Ошибка ввода".
 */

import java.util.Scanner;
import java.util.Arrays;

public class Task5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] massive = new int[x];
        for(int i =0;i<x;i++){
            massive[i] = sc.nextInt();
        }

        Arrays.sort(massive);
        int ss = sc.nextInt();

        if(ss >x || ss<0) System.out.println("Ошибка ввода");
        else System.out.println(massive[ss - 1]);


    }
}

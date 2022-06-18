package Array;

import java.util.*;

public class Task2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        int sum = 0;
        for (int j = 0; j < n; j++)
            sum = a[j] + sum;

        System.out.println(sum);

        for (int k = a.length -1; k >= 0; k--)
            System.out.println(a[k]);
    }
}

/*
Вводится список (сначала количество элементов, потом сами элементы).
Найдите сумму всех элементов и выведите её. А потом выведите введённые
числа в обратном порядке.
 */

package Array;

/*

Поменяться местами
Дан список (сначала количество элементов, потом сами элементы).
Потом водятся два числа: a и b. Поменяйте местами значения a-ого
и b-ого элементов массива и выведите его на экран построчно.
Гарантируется, что а и b не выходят за границы размеров массива.

Sample Input:

5
12
78
45
378
12
2
4

Sample Output:

12
78
12
378
45

 */

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] mas = new int[n];

        for (int i = 0; i < n; i++) {
            mas[i] = sc.nextInt();
        }

        int a = sc.nextInt();
        int b = sc.nextInt();

        int k = mas[a];
        mas[a] = mas[b];
        mas[b] = k;

        for (int i = 0; i < n; i++) {
            System.out.println(mas[i]);
        }

    }
}

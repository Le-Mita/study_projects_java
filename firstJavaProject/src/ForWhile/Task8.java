package ForWhile;

import java.util.*;

public class Task8 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        int sum = 0;

        while (a <= n) {
            sum += a * a;
            a++;
        }
        System.out.print(sum);
    }
}
/*
Сумма квадратов

По данному натуральному n вычислите сумму 1^2 + 2^2 +...+ n^2.
 */

package ForWhile;

import java.util.*;

public class Task11_1 {

    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        int a = i.nextInt(), counter = 0, sum = 0;


        while (counter < a) {

            int b = i.nextInt();
            sum += b;
            counter++;

        }
        System.out.println(sum);
    }
}
/*
public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += sc.nextInt();
            i++;
        }
        System.out.print(sum);
    }
 */

/*
Пользователь вводит с клавиатуры натуральное число n.
Затем вводит n целых чисел. Необходимо найти и вывести на экран их сумму.
 */
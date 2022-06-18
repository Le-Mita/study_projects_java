package ForWhile;

/*
Пользователь вводит с клавиатуры натуральное число n.
Затем вводит n целых чисел. Необходимо найти и вывести на экран их сумму.
 */
import java.util.*;

public class Task11_2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int a =sc.nextInt();
            sum += a;
        }
        System.out.print(sum);
    }
}

package ForWhile;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int x = num.nextInt(), y = num.nextInt();
        for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*На вход подаётся два натуральных числа x и y.
Выведите на печать прямоугольник из звёздочек размером x*y.*/
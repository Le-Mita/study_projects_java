package ForWhile;

import java.util.Scanner;

class Task1 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int x = num.nextInt();
        if (x < 6) {
            System.out.println("Таких чисел нет");
        } else {
            for (int i = 1; i <= x; ++i) {
                if (i % 2 == 0 && i % 3 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
/*На вход подаётся натуральное число n. Выведите
на печать в одной строке через пробел все числа
от 1 до n включительно, которые одновременно
без остатка делятся на 2 и на 3. Если таких чисел
в диапазоне нет, выведите "Таких чисел нет".*/
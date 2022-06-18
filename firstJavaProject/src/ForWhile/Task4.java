package ForWhile;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double sum = 0;
        int c = 0;

        while (a != 0) {
            sum = sum + a;
            a = sc.nextDouble();
            c++;
        }
        System.out.print(sum / c);
    }
}
/*
Считывание чисел с клавиатуры

Пользователь с клавиатуры вводит действительные числа до 0.
Необходимо вычислить их среднее арифметическое.
Гарантируется, что он введёт хотя бы одно ненулевое число.
 */
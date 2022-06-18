package Condition;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
    Scanner num;
        num = new Scanner(System.in);
        int x = num.nextInt(), y = num.nextInt();

    if (x > y) {
        System.out.println("Махатма");
    } else {
        System.out.println("Джавахарлал");
    }
}
}
/*Два индийских программиста, Махатма и Джавахарлал,
решили выяснить, кто из них быстрее пишет код. Напишите
программу, которая поможет им выяснить это.

На вход подаются два целых числа в одной строке через
пробел. Если первое число больше второго, необходимо
вывести на печать "Махатма", если второе - "Джавахарлал".
Гарантируется, что числа больше нуля и различны.*/
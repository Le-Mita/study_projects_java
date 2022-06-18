package Condition;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        String x = num.nextLine(), y = num.nextLine();
        if (x.length() > y.length()) {
            System.out.println("Махатма");
        } else {
            System.out.println("Джавахарлал");
        }
    }
}
/*Два индийских программиста, Махатма и Джавахарлал,
решили выяснить, чей код длиннее. Напишите программу,
которая поможет им выяснить это.

На вход подаются две строки текста. Если первая
строка длиннее второй, необходимо вывести на печать
"Махатма", если наоборот - "Джавахарлал". Гарантируется,
что строки имеют разную длину.*/
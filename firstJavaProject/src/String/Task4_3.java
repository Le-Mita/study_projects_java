package String;

import java.util.*;

public class Task4_3 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int x = userInput.nextInt();
        int y = 60;
        System.out.print(((x / (y * y)) % 24 / 10) + "" + (x / (y * y) % 24 % 10) + ":");
        System.out.print((x / y % y / 10)+ "" + (x / y % y % 10) + ":");
        System.out.print((x % y % y / 10) + "" + (x % y % y % 10));
    }
}
/*Реализуйте простые домашние часы.
На вход подаётся число секунд, которое прошло с момента начала суток (00:00:00).
Выведите текущее время в формате ЧЧ:ММ:СС.
Примечание 1. Используйте 24-часовой формат.
Примечание 2. Для преобразования типа int в тип String (если это понадобится)
можно использовать встроенный служебный метод String.valueOf(num),
который преобразует число num в строку "num".
*/
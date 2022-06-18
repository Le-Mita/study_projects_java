package String;

import java.util.*;

public class Task4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int se = s % 60;
        int mi = s % 3600 / 60;
        int ch = s % 86400 / 3600;

        System.out.format("%02d" + ":" + "%02d" + ":" + "%02d", ch, mi, se);
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
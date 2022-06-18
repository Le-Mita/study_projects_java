package String;

import java.util.*;

public class Task4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = Math.abs(sc.nextInt());
        int s = time % 60;
        int m = time / 60 % 60;
        int h = time / 3600 % 24;

        System.out.print("" + h/10 + h%10 + ":" + m/10 + m%10 + ":" + s/10 + s%10);
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
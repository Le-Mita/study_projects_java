package Condition;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        String x = num.nextLine(), y = num.nextLine();
        if (x.equals(y)) {
            System.out.println("Access is granted");
        } else {
            System.out.println("Access is denied");
        }
    }
}
/*На первой строке подаётся пароль, хранящийся в базе данных,
на второй - пароль, введённый пользователем.

Выведите на печать фразу "Access is granted", если пользователь
ввёл верный пароль, и "Access is denied" - если нет. */
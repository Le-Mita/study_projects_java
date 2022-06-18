package String;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String text1 = s.nextLine();
        String text2 = s.nextLine();

        System.out.println(text1.equals(text2));
    }
}

/*На вход подаются две строки текста. Выведите
на печать true, если строки совпадают, и false - если нет.
 */
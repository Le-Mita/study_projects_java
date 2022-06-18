package String;
import java.util.*;
public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String text = s.nextLine();
        String word = s.nextLine();
        boolean result = text.contains(word);

        System.out.print(result);
    }
}


/*На вход подаётся строка текста, затем слово.
Выведите на печать true, если слово содержится
в строке, и false - если не содержится.
*/
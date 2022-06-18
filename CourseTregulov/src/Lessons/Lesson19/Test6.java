package Lessons.Lesson19;

public class Test6 {
    public static void main(String[] args) {
        String[] array = {"privet", "poka", "ok"};
        for (String s:array) {
            s = new String("hello");
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

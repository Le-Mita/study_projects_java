package Lessons.Lesson21;

// пример на тернарный оператор

public class Test1 {
    public static void main(String[] args) {
        int a = 3;
        System.out.println((a < 4 ? 7 : "ok"));
    //    int b = (a < 4) ? 7 : "ok"; так нельзя

        int b = 5;
        int c = 5;
        int d = (b < 6) ? b++: c++;
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}

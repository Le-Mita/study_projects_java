package Lessons.Lesson21;

//при вызове метода, требующего в параметр тип данных int
//мы можем использовать тип данных char

public class Test4 {
    void abc(int i) {
        System.out.println(i);
    }

    public static void main(String[] args) {
        Test4 t = new Test4();
        char c = 'a';
        t.abc(c);
        System.out.println('b' + 10);
    }
}

package Lessons.Lesson21;

//оверлоад методы могут иметь как примитивные так и ссылочные
//параметры

public class Test3 {

    public void abc(String s) {
        System.out.println(s);
    }

    public void abc(boolean b) {
        System.out.println(b);
    }

    private StringBuilder abc(StringBuilder sb) {
        System.out.println(sb);
        return new StringBuilder("poka");
    }
}

package Lessons.Lesson21;

public class Test6 {

    public void abc(int a, double b) {
        System.out.println("privet");
    }

    public void abc(double a, int b) {
        System.out.println("poka");
    }

    public static void main(String[] args) {
        Test6 t = new Test6();
        t.abc(1, 2.0);
    }
}

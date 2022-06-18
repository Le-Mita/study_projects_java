package Lessons.Lesson21;

public class Test2 {
    Test2() {
        System.out.println("sozdalsya obyekt, eto konstruktor");
    }

    void Test2() {
        System.out.println("eto metod");
    }

    int Test2 = 5; // eto peremennaya
}

class A {
    public static void main(String[] args) {
        Test2 t = new Test2();
    }
}

package Lessons.Lesson23;

public class Test3 {

    public static void main(String[] args) {
        Employee1 e = new Employee1();
        e.eat();
        Teacher1 t = new Teacher1();
        t.eat();
    }
}

class Employee1 {
    double salary = 100;
    String name = "Kolya";
    int age;
    int experience;
    void eat() {
        System.out.println("Kushaet rabotnik");
    }
    void sleep() {
        System.out.println("Spat");
    }
}

class Teacher1 extends Employee1 {
    int kolichestvoUchenikov;
    void eat() {
        System.out.println("Kushaet uchitel");
    }
    void uchit() {
        System.out.println("Uchit");
    }
}

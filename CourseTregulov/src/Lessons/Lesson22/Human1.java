package Lessons.Lesson22;

public class Human1 {

    public String name;
    public static int salary = 150;
    public void work() {
        System.out.println("Rabotat");
    }
    public static void rest() {
        System.out.println("Otdixat");
    }

}

class Student extends Human1 {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
        System.out.println(Student.salary);
        s.work();
        Student.rest();

    }
}

package Lessons.Lesson19;

public class Test3 {
    public static void main(String[] args) {
        String[] students = {"Ivanov", "Petrov", "Sidorov"};
        String[] exems = {"mat analiz", "filosofiya"};

        for (String s1 : students) {
            for (String s2 : exems) {
                System.out.println(s1 + " " + s2);
            }
        }
    }
}

package Lessons.Lesson22.p1;

import Lessons.Lesson22.Human;

public class Test1 {
    public static void main(String[] args) {
        Human c = new Human("male");
        c.setName("Kolya");
        c.setAge(15);
        c.setVes(50);
        System.out.println(c.getName());
        System.out.println(c.getAge());
        System.out.println(c.getVes());
    }
}

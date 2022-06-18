package Lessons.Lesson22;

public class Human {
    final String pol;
    public Human(String pol) {
        this.pol = pol;
    }

    //здесь метод инкапсуляции для name
    //get позволяет видеть, set позволяет изменять
    private String name;
    public String getName() {//методы public get позволяют видеть name
        return name;
    }
    public void setName(String s) {
        name = s; //public set позволять менять name
    }


    private int age;

    public int getAge() {
        return age;
    }
    public void setAge(int i) {
        if (i > 0) {
            age = i;
        }
    }

    private boolean clever;

    public boolean isClever() {
        return clever;
    }

    private int ves;

    public int getVes() {
        return ves;
    }

    public void setVes(int i) {
        if (i > 0) {
            ves = i;
        }
    }
}

class Test {
    public static void main(String[] args) {
        Human c = new Human("male");
//        c.name = "Petya"; так написать не получится
//        c.age = 2500;
//        c.ves = -65;
        c.setName("Kolya");
        c.setAge(15);
        c.setVes(50);
        System.out.println(c.getName());
        System.out.println(c.getAge());
        System.out.println(c.getVes());
    }
}

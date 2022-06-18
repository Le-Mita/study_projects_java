package Lessons.Lesson23;

public class Test2 {
    public static void main(String[] args) {
        Doctor d = new Doctor();
        Teacher t = new Teacher();
        Driver dr = new Driver();
        Employee e = new Employee();

        Employee emp1 = new Doctor();
        System.out.println(emp1.salary);
        System.out.println(emp1.name);
        System.out.println(emp1.age);
        System.out.println(emp1.experience);
        emp1.eat();
        emp1.sleep();
        //emp1.lechit(); этот метод от Doctor здесь работать не будет


        Employee emp2 = new Teacher();
        Employee emp3 = new Driver();

        Xirurg x = new Xirurg();


        Doctor d2 = new Xirurg();
        System.out.println(d2.experience);
        //System.out.println(d2.skalpel); не работает
        //d2.operaciya();
        d2.eat();
        d2.sleep();
        d2.lechit();


        Employee emp4 = new Xirurg();
        emp4.eat();
        emp4.sleep();
        //System.out.println(emp4.skalpel);
        //emp4.operaciya();

    }
}

class Employee extends java.lang.Object {
    double salary = 100;
    String name;
    int age;
    int experience;

    void eat() {
        System.out.println("Kushat");
    }

    void sleep() {
        System.out.println("Spat");
    }
}

class Doctor extends Employee {

    String specializaciya;

    void lechit() {
        System.out.println("Lechit");
    }
}

class Xirurg extends Doctor {

    String skalpel;

    void operaciay() {
    }
}

class Teacher extends Employee {

    int kolichestvoUchenikov;

    void uchit() {
        System.out.println("Uchit");
    }
}

class Driver extends Employee {

    String nazvanieMashini;

    void vodit() {
        System.out.println("Vodit");
    }
}


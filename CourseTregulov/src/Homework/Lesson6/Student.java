package Homework.Lesson6;

/*
Измените класс Student так, чтобы он имел 3 конструктора. 1-ый принимает все параметры.
 2-ой только id, name, surname, course. 3-ий не принимает значений. Создайте в классе СтудентТест
 три объекта с помощью разных конструкторов.
 */

public class Student {

    int studentId;
    String name;
    String surname;
    int course;

    double mathAverageGrade;
    double economicsAverageGrade;
    double foreignLanguageAverageGrade;


    Student (int studentId2, String name2, String surname2, int course2, double mathAverageGrade2,
             double economicsAverageGrade2, double foreignLanguageAverageGrade2) {
        studentId = studentId2;
        name = name2;
        surname = surname2;
        course = course2;
        mathAverageGrade = mathAverageGrade2;
        economicsAverageGrade = economicsAverageGrade2;
        foreignLanguageAverageGrade = foreignLanguageAverageGrade2;
    }

    Student (int studentId3, String name3, String surname3, int course3) {
        this (studentId3, name3, surname3, course3, 0, 0,
                0);
    }

    Student () {
    }
}

class StudentTest {

    double sredArifOcenka(Student st) {
        double sredOcenka = (st.mathAverageGrade + st.economicsAverageGrade +
                st.foreignLanguageAverageGrade) / 3;
        System.out.println("Srednyaya Arifmeticheskaya Ocenka Studenta " + st.name
         + " " + st.surname + ": " + sredOcenka);
        return sredOcenka;
    }

    public static void main(String[] args) {

        Student st1 = new Student();
        st1.studentId = 1;
        st1.name = "Nikolay";
        st1.surname = "Ivanov";
        st1.course = 3;
        st1.mathAverageGrade = 7.8;
        st1.economicsAverageGrade = 9.2;
        st1.foreignLanguageAverageGrade = 8.8;

        Student st2 = new Student(2, "Alexey", "Petrov", 1);
        st2.mathAverageGrade = 6.3;
        st2.economicsAverageGrade = 7;
        st2.foreignLanguageAverageGrade = 8.5;

        Student st3 = new Student(3, "Anton", "Sidorov", 4,
                9.1, 9, 10);


        StudentTest sTest = new StudentTest();
        sTest.sredArifOcenka(st1);
        sTest.sredArifOcenka(st2);
        sTest.sredArifOcenka(st3);

    }
}
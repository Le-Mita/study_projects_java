package Homework.Lesson4;

public class Student {

    int studentId;
    String name;
    String surname;
    int course;

    double mathAverageGrade;
    double economicsAverageGrade;
    double foreignLanguageAverageGrade;
}

class StudentTest {
    public static void main(String[] args) {

        Student st1 = new Student();
        st1.studentId = 1;
        st1.name = "Nikolay";
        st1.surname = "Ivanov";
        st1.course = 3;
        st1.mathAverageGrade = 7.8;
        st1.economicsAverageGrade = 9.2;
        st1.foreignLanguageAverageGrade = 8.8;

        Student st2 = new Student();
        st2.studentId = 2;
        st2.name = "Alexey";
        st2.surname = "Petrov";
        st2.course = 1;
        st2.mathAverageGrade = 6.3;
        st2.economicsAverageGrade = 7;
        st2.foreignLanguageAverageGrade = 8.5;

        Student st3 = new Student();
        st3.studentId = 3;
        st3.name = "Anton";
        st3.surname = "Sidorov";
        st3.course = 4;
        st3.mathAverageGrade = 9.1;
        st3.economicsAverageGrade = 9;
        st3.foreignLanguageAverageGrade = 10;

        System.out.println("Средняя арифметическая оценка студента " + st1.name
        + " " + st1.surname  + " = " + (st1.mathAverageGrade + st1.economicsAverageGrade
         + st1.foreignLanguageAverageGrade) / 3);

        System.out.println("Средняя арифметическая оценка студента " + st2.name
                + " " + st2.surname  + " = " + (st2.mathAverageGrade + st2.economicsAverageGrade
                + st2.foreignLanguageAverageGrade) / 3);

        System.out.println("Средняя арифметическая оценка студента " + st3.name
                + " " + st3.surname  + " = " + (st3.mathAverageGrade + st3.economicsAverageGrade
                + st3.foreignLanguageAverageGrade) / 3);
    }
}
package Homework.Lesson8;

public class Task1 {

    static double umnojenye (double a, double b, double c) {
        return a * b * c;
    }

    static void delenye (int a, int b) {
        System.out.println("Целое частное = " + a / b + "; Остаток = " + a % b);
    }
}

class Task1Test {
    public static void main(String[] args) {
        System.out.println(Task1.umnojenye(2, 3, 4));
        Task1.delenye(9, 2);
        System.out.println(Task1.umnojenye(2.5, 3.5, 4));
        Task1.delenye(15, 4);
    }
}

/*
В первом классе создайте 2 static метода.
1-й умножает 3 числа из параметра метода и возвращает их произведение
2-й делит первое число из параметров на второе и ничего не возвращает,
только выводит на дисплей в читабельном виде целое частное и остаток
Во втором классе по 2 раза используйте данные методы
 */
package Homework.Lesson8;

public class Task2 {

    public final static double PI = 3.14;

    public double ploschad(double radius) {
        double pl = PI * radius * radius;
        return pl;
    }

    public static double dlina(double radius2) {
        double dl = 2 * PI * radius2;
        return dl;
    }

    public void info(double radius3) {
        System.out.println("Радиус = " + radius3);
        System.out.println("Площадь круга = " + ploschad(radius3));
        System.out.println("Длина окружности = " + dlina(radius3));
    }

}

class Task2Test {
    public static void main(String[] args) {
        Task2 z = new Task2();
        z.ploschad(5);
        Task2.dlina(7.5);
        z.info(3);
    }
}

/*
В 1-ом классе создайте static final переменную Пи = 3.14.
Используйте данную константу в non-static методе, который
принимает в параметре значение радиуса и вычисляет площадь
круга по формуле: S = Pi * r * r. Также используйте данную
константу в static методе, который принимает в параметре
значение радиуса и вычисляет длину окружности по формуле:
S = 2 * Pi * r. Создайте еще один non-static метод, который
принимает в параметре значение радиуса и выводит на экран
информацию о радиусе, площади круга и длине окружности.
Используйте все 3 метода во 2-ом классе.
 */
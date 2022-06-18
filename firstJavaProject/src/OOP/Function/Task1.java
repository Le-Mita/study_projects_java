package OOP.Function;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String figure = sc.nextLine();
        int x = sc.nextInt();
        perimeter(figure, x);
        area(figure, x);
    }

    static void perimeter(String s, int x) {

        if (s.equals("Квадрат")) {
            int p = x * 4;
            System.out.println(p);
        }

        else {
            double p = 2 * 3.14 * x;
            System.out.println((int)Math.ceil(p));
        }
    }

    static void area(String s, int x) {

        if (s.equals("Квадрат")) {
            int pl = x * x;
            System.out.println(pl);
        }

        else {
            double pl = 3.14 * x * x;
            System.out.println((int)Math.ceil(pl));
        }
    }
}
/*
Необходимо написать программу для поиска площади
и периметра квадрата или круга. Напишите две функции:
perimeter и area, каждая из них принимает строку -
название фигуры и одно целое число (либо радиус круга,
либо сторону квадрата). Как результат они выводят периметр
и площадь фигуры соответственно. В ответ они должны вывести
именно целое число (при надобности округлять "вверх",
то есть до ближайшего большего целого числа). Содержание
функции main менять запрещено. Пи брать как 3.14.
 */
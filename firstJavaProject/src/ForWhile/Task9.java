package ForWhile;

import  java.util.*;

public class Task9 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        int c = 1;


        while (x < y) {
            x = x * 1.1;
            c++;
        }
        System.out.print(c);
    }
}
/*
Утренняя пробежка

В первый день спортсмен пробежал x километров, а затем
он каждый день увеличивал пробег на 10% от предыдущего значения.
По данному числу y определите номер дня, на который пробег
спортсмена составит не менее y километров.

Входные данные
Программа получает на вход действительные числа x и y

Выходные данные
Программа должна вывести одно натуральное число.
 */
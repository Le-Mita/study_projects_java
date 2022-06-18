package Homework.Lesson6;

public class FiveMethods {


    /* Создайте класс, в котором будут 5 оверлоад методов, которые вычисляют сумму нуля, одного,
     двух, трех и четырех целых чисел соответственно, передают эту сумму в output и выводят ее на экран.
     В случае, когда слагаемые отсутствуют (т.е. когда параметров нет) сумма пусть равняется 0.
     */


//    int a1;
//    int a2;
//    int a3;
//    int a4;
//
//    FiveMethods() {
//        System.out.println();
//    }
//
//    FiveMethods(a1) {
//        System.out.println(a1);
//    }
//
//    FiveMethods(a1, a2) {
//        System.out.println(a1 + a2);
//    }
//
//    FiveMethods(a1, a2, a3) {
//        System.out.println(a1 + a2 + a3);
//    }
//
//    FiveMethods(a1, a2, a3, a4) {
//        System.out.println(a1 + a2 + a3 + a4);
//    }

    int sum() {
        int result = 0;
        System.out.println("Summa vsex chisel: " + result);
        return result;
    }

    int sum(int a1) {
        int result1 = a1;
        System.out.println("Summa vsex chisel: " + result1);
        return result1;
    }

    int sum(int a2, int a3) {
        int result2 = a2 + a3;
        System.out.println("Summa vsex chisel: " + result2);
        return result2;
    }

    int sum(int a4, int a5, int a6) {
        int result3 = a4 + a5 + a6;
        System.out.println("Summa vsex chisel: " + result3);
        return result3;
    }

    int sum(int a7, int a8, int a9, int a10) {
        int result4 = a7 + a8 + a9 + a10;
        System.out.println("Summa vsex chisel: " + result4);
        return result4;
    }
}

class FiveMethodsTest {
    public static void main(String[] args) {

        FiveMethods fM = new FiveMethods();
        fM.sum();
        fM.sum(3);
        fM.sum(4,5);
        fM.sum(6,7,8);
        fM.sum(9,10,11,12);
    }
}
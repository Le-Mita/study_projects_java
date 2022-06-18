package Homework.Lesson18;

/*
Создайте класс, в котором создайте метод showArray. Инпут
параметром данного метода будет двумерный массив типа String.
Метод должен выводить на экран данный массив в следующем виде:
{ {elem00, elem01}, {elem10}, {elem10, elem11} }
 */

public class Task2 {

    public static void showArray(String[][] array) {
        System.out.print("{ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("{");
            for (int j = 0; j < array[i].length; j++) {
                if (j != array[i].length - 1) {
                    System.out.print(array[i][j] + ", ");
                } else {
                    System.out.print(array[i][j]);
                }
            }
            if (i != array.length - 1) {
                System.out.print("}, ");
            } else {
                System.out.print("}");
            }

        }
        System.out.println(" }");
    }

    public static void main(String[] args) {
        String array[][] = {{"apple", "orange"}, {"hello", "bye", "ok"}, {"car"}};
        showArray(array);

    }
}

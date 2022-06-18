package Homework.Lesson18;

/*
создайте класс, в котором создайте метод sortirovka. Инпут
параметром данного метода будет одноименный массив типа int.
Метод должен возвращать уже отсортированный по возрастанию
массив.
 */

public class Task1 {
    public static int[] sortirovka(int[] array) {
        int a;
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
            if (i != index) {
                a = array[i];
                array[i] = min;
                array[index] = a;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int [] array = {5, 8, 1, -3, 0, 8, 2, 2};
        sortirovka(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

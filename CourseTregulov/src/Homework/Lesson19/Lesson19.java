package Homework.Lesson19;

/*
Создайте метод abc, инпут параметр которого - N-ое количество массивов
типа String. В методе создайте новые массив, который будет состоять из
элементов массивов-параметров и будет оутпутом данного метода. В методе
main вызовите метод abc и его элементам, которые равны значениям
command line параметров, присвойте значение null. Выведите элементы
обновленного массива на экран. Везде, где возможно, используйте foreach loop.
Запустите приложение с командной строки.
 */

class Lesson19 {

    public static String[] abc(String[]... array1) {
        int length = 0;
        for (String[] array2 : array1) {
            length += array2.length;
        }
        String[] target = new String[length];
        int count = 0;
        for (String[] array2 : array1) {
            for (String s : array2) {
                target[count] = s;
                count++;
            }
        }
        return target;
    }

    public static void main(String[] args) {
        String[] target = abc(new String[]{"ok", "privet", "poka"}, new String[]{"ok", "hello", "bye"});

        for (String s : args) {
            for (int i = 0; i < target.length; i++) {
                if (s.equals(target[i])) {
                    target[i] = null;
                }
            }

        }

        for (String s : target) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}

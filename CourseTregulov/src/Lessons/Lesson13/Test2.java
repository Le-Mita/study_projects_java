package Lessons.Lesson13;

public class Test2 {

    public static void main(String[] args) {

        switch ("среда") {

            case "понедельник":

            case "вторник":

            case "среда":

            case "четверг":

            case "пятница":
                System.out.println("Работа до 18:00");
                break;
            case "суббота":
                System.out.println("Работа до 14:00");
                break;
            case "воскресенье":
                System.out.println("Нерабочий день");
                break;
            default:
                System.out.println("Такого дня не существует");
        }
    }
}

package Lessons.Lesson20;

import java.util.*;

public class Test1 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("poka");
        list.add("privet");
        list.add("ok");
        list.add(1, "hello");

        for (String s : list
        ) {
            System.out.print(s + " ");
        }

        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list.get(3));

        list.set(1, "!!!");
        for (String s : list
             ) {
            System.out.print(s + " ");

        };
    }
}

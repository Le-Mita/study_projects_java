package Lessons.Lesson17;

public class Test1 {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Good day!");
        StringBuilder sb3 = new StringBuilder(50);
        StringBuilder sb4 = new StringBuilder(sb3);

        System.out.println(sb2.length());
        System.out.println(sb2.charAt(3));
        System.out.println(sb2.indexOf("!"));
        System.out.println(sb2.indexOf("o", 2));

        String s = sb2.substring(5);
        System.out.println(s);

        String s2 = sb2.substring(5, 8);
        System.out.println(s2);
        System.out.println(sb2.subSequence(5, 8));

        sb2.append(22);
        System.out.println(sb2);
        sb2.append(true);
        System.out.println(sb2);
        sb2.append(sb2);
        System.out.println(sb2);



    }
}

package Lessons.Lesson16;

public class Test1 {

    public static void main(String[] args) {

        String s1 = new String("privet");

        int a = s1.length();
        System.out.println(a);

        char c1 = s1.charAt(3);
        System.out.println(c1);

        int i1 = s1.indexOf('t');
        System.out.println(i1);

        int i2 =s1.indexOf("vet");
        System.out.println(i2);

        boolean b1 = s1.startsWith("pr");
        System.out.println(b1);

        boolean b2 = s1.endsWith("vet");
        System.out.println(b2);
    }
}

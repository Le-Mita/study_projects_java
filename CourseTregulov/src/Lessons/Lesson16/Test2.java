package Lessons.Lesson16;

public class Test2 {

    public static void main(String[] args) {

        String s1 = new String("abcdefgabcd");

        String s9 = s1.substring(3);
        System.out.println(s9);
        System.out.println(s1);

        String s11 = s1.substring(3, 7);
        System.out.println(s11);

        String s12 = s1.trim(); // убирает пробелы вначале и конце
        System.out.println(s12);

        String s14 = s1.replace('f', 'A');
        System.out.println(s14);

        String s15 = s1.replace("abcd", "UA");
        System.out.println(s15);

        String s2 = "poka";
        String s3 = s2.replace('k', 'k');
        System.out.println(s2 == s3);

        String s5 = "privet, ";
        String s6 = "drug";
        System.out.println(s5.concat(s6));


    }


}

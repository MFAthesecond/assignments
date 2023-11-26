package week_10.Question_10_22;

public class Question_10_22 {
    public static void main(String[] args) {
        char[] ch = {'I', 'N', 'A', 'R'};

        MyString1 s1 = new MyString1(ch);
        System.out.println(s1.toString());

        MyString1 s2 = s1.toLowerCase();
        System.out.println(s2);

        MyString1 s3 = s2.substring(0, 3);
        System.out.println(s3);

        System.out.println(s3.length());
        System.out.println(s1.equals(s2));

        MyString1 s4 = new MyString1(ch);
        System.out.println(s1.equals(s4));

        MyString1 s5 = MyString1.valueOf(65913);
        System.out.println(s5);
    }
}
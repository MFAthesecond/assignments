package week_10.Question_10_22;

public class MyString1 {
    private char[] chars;

    public MyString1(char[] chars) {
        this.chars = chars;
    }

    public char charAt(int index) {
        return chars[index];
    }

    public int length() {
        return chars.length;
    }

    public MyString1 substring(int begin, int end) {
        if (begin < 0 || begin > length() || end < 0 || end > length() || begin > end) {
            System.out.println("Invalid substring parameters!");
            System.exit(-1); //It is better to throw an exception, i think..
        }
        char[] newArray = new char[end - begin];

        for (int i = begin; i < end; i++) {
            newArray[i] = charAt(i);
        }
        return new MyString1(newArray);
    }

    public MyString1 toLowerCase() {

        char[] ch = new char[length()];

        for (int i = 0; i < length(); i++) {
            if (chars[i] <= 'Z' && chars[i] >= 'A') {
                ch[i] = (char) (charAt(i) + ('a' - 'A'));
            } else {
                ch[i] = charAt(i);
            }
        }
        return new MyString1(ch);
    }

    public boolean equals(MyString1 str) {
        if (length() != str.length()) {
            return false;
        }
        for (int i = 0; i < length(); i++) {
            if (charAt(i) != str.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static MyString1 valueOf(int i) {

        int counter = 0;
        int number = i;

        while (number > 0) {
            number /= 10;
            counter++;         //finds number of digits
        }
        char[] ch = new char[counter];

        for (int j = counter - 1; j >= 0; j--) {
            ch[j] = (char) ('0' + i % 10);
            i /= 10;
        }
        return new MyString1(ch);

    }

    public String toString() {
        String s = new String(chars);
        return s;
    }
}

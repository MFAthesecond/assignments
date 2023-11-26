package week_06;

public class Question_06_12 {
    public static void printChars(char ch1, char ch2, int numberPerLine) {
        System.out.printf("Characters per %c to %c\n",ch1,ch2);
        int count=0;
        for (int i = ch1; i <=ch2 ; i++) {
            System.out.print((char) i+" ");
            count++;
            if (count%10==0){
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
       printChars('1','Z',10);
    }
}

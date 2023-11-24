package week_05.nias;

import java.util.Scanner;

public class Question_05_03_sağayaslama {

    public static void main(String[] agrs) {
        Scanner input = new Scanner(System.in);


        System.out.printf("Kilograms       Pounds");
        for (int i = 1; i <= 199; i+=2) {

            System.out.printf( "\n%1d                  %10.1f " , i  , (i*2.2));


            }

        }


    }


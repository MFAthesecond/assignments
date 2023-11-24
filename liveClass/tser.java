package liveClass;

import my_projects.Circle;

import java.util.ArrayList;
import java.util.Arrays;

public class tser {
    public static void main(String[] args) {

        var arrayList = new ArrayList<Integer>();
        System.out.println(arrayList instanceof ArrayList<Integer>);

        var name = "Inar";
        System.out.println(name instanceof String);

        var circle=new Circle();
        System.out.println(circle instanceof Circle);

        int[] array = {1, 5, 6, 1, 8, 4, 5};
        Arrays.sort(array);

        System.out.println(array.toString());
    }
}

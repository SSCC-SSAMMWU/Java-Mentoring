package day02.EvenFiles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Quest06 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2));
        myList.sort(Collections.reverseOrder());
        System.out.println(myList);
    }
}
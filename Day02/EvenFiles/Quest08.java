package EvenFiles;

import java.util.HashMap;

public class Quest08 {
    public static void main(String[] args) {
        HashMap<String, Integer> grade = new HashMap<>();
        grade.put("A", 90);
        grade.put("B", 80);
        grade.put("C", 70);

        int pop = grade.remove("B");
        System.out.println(pop);
    }
}
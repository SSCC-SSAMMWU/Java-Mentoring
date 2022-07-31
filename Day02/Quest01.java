import java.util.Collection;
import java.util.HashMap;


public class Quest01 {

    public static int returnSum(Collection<Integer> values) {
        int sum = 0;
        for (int i: values) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("국어", 80);
        scores.put("영어", 75);
        scores.put("수학", 55);

        System.out.print("홍길동님의 평균 점수는 ");
        System.out.print(returnSum(scores.values()) / scores.size());
        System.out.println("점입니다.");
    }

}

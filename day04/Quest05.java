package day04;

import java.util.ArrayList;
import java.util.Arrays;

class Calculator2 {
    int value;

    Calculator2() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    int getValue() {
        return this.value;
    }

    double avg(int[] values) {
        int sum = 0;
        for (int val : values) { sum += val; } 
        return sum / values.length;
    }
    double avg(ArrayList<Integer> values) {
        int sum = 0;
        for (int val : values) { sum += val; }
        return sum / values.size();
    }
}

public class Quest05 {
    public static void main(String[] args) {
        Calculator2 cal = new Calculator2();
        // 정수 배열
        int[] data = {1, 3, 5, 7, 9};
        System.out.println("정수 배열의 평균은 " + cal.avg(data));
        // 정수 리스트
        ArrayList<Integer> data2 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        System.out.println("정수 리스트의 평균은 " + cal.avg(data2));
    }
}

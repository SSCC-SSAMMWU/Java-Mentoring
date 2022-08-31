package day06;

import java.util.Arrays;

class Calculator {
    int[] prepare;

    public Calculator(int[] prepare) {
        this.prepare = prepare;
    }

    public int sum() {
        return Arrays.stream(prepare).sum();
    }

    public double avg() {
        return Arrays.stream(prepare).sum() / prepare.length;
    }
}


//계속 더하게 시키는 건 줄 알고 개뻘짓;;
//class Calculator {
//    private static int sum = 0;
//    private static int cnt = 0;
//
//    public Calculator(int[] prepare) {
//        sum += Arrays.stream(prepare).sum();
//        cnt += prepare.length;
//    }
//
//    public int sum() {
//        return sum;
//    }
//
//    public double avg() {
//        return sum / cnt;
//    }
//}

public class Quest02 {
    public static void main(String[] args) {
        int[] data1 = {1, 2, 3, 4, 5};
        Calculator cal1 = new Calculator(data1);
        System.out.println(cal1.sum());
        System.out.println(cal1.avg());

        int[] data2 = {6, 7, 8, 9, 10};
        Calculator cal2 = new Calculator(data2);
        System.out.println(cal2.sum());
        System.out.println(cal2.avg());
    }

}

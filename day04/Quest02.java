package day04;
import java.util.Scanner;

class Grade {
    private int math;
    private int science;
    private int english;
    public Grade(int math, int science, int english) {
        this.math = math;
        this.science = science;
        this.english = english;
    }
    public int avg() {
        return (this.math + this.science + this.english) / 3;
    }
}

public class Quest02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("수학, 과학, 영어 순으로 3개의 점수 입력 >>> ");
        int math = scanner.nextInt();
        int sci = scanner.nextInt();
        int eng = scanner.nextInt();
        Grade me = new Grade(math, sci, eng);
        System.out.println("내 점수의 평균은 " + me.avg());
        scanner.close();
    }
}
package day03;

public class Quest05 {
    public static void main(String[] args) {
        int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
        int sumGrade = 0;
        float avgGrade;
        for (int mark : marks) {
            sumGrade += mark;
        }
        avgGrade = sumGrade / marks.length;
        System.out.println("A학급의 평균 점수는 " + avgGrade + "점 입니다.");
    }
}

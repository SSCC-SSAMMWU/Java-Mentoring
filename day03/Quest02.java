package day03;

public class Quest02 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i <= 1000) {
            if (i % 3 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println("1부터 1000까지의 3의 배수의 합은 " + sum + "입니다");
    }
}

package day06;

import java.util.Scanner;

public class Quest03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] text;
        text = scanner.nextLine().split("");

        String last = "nan";
        int cnt = 1;
        for (String lastChar: text) {
            if (!last.equals(lastChar)) {
                if (cnt != 1) {
                    System.out.print(last + cnt);
                }
            last = lastChar;
            cnt = 1;
            } else {
                cnt += 1;
            }
        }
        if (cnt != 1) {
            System.out.println(last + cnt);
        }
    }
}

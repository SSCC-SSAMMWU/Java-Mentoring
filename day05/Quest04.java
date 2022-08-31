package day05;

import java.util.Scanner;

public class Quest04 {
    public static void main(String[] args) {
        String input = "";
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
//        자동으로 END 반복 안하도록 하기
        while (!input.equals("END")) {
            System.out.println(input.toUpperCase());
            input = scanner.nextLine();
        }
        scanner.close();
    }
}

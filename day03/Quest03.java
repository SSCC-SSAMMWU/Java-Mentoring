package day03;

public class Quest03 {
    public static void main(String[] args) {
        for (int y = 1; y < 6; y++) {
            for (int x = 0; x < y; x++) {
                System.out.print("*");
            }
            if (y < 5) {
                System.out.println("");
            }
        }
    }
}

package day04;

class Calculator {
    int value;

    Calculator() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }
    int getValue() {
        return this.value;
    }
    boolean isOdd() {
        if (this.value%2 == 1) {
            return true;
        }
        return false;
    }
}
public class Quest04 {
    public static void main(String[] args) {
        Calculator num01 = new Calculator();
        System.out.println(num01.getValue());
        System.out.println(num01.isOdd());
        num01.add(1);
        System.out.println(num01.getValue());
        System.out.println(num01.isOdd());
    }
}

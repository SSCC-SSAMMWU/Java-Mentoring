package day05;

class Calculator {
    int value;

    public Calculator() {
        //    굳이 this를 넣어야 하나..?
        this.value = 0;

    }

    public void add(int value) {
        this.value += value;
    }

    public int getValue() {
        return value;
    }
}


class UpgradeCalculator extends Calculator {
    public void minus(int value) {
//        value를 private로 주니까 받아 올 수 없음
        this.value -= value;
    }
}


public class Quest03 {
    public static void main(String[] args) {
        UpgradeCalculator cal = new UpgradeCalculator();
        cal.add(10);
        cal.minus(3);
        System.out.println(cal.getValue());


    }
}

package day06;

interface Mineral {
    int getValue();
}

class Gold implements Mineral {
    public int getValue() {
        return 100;
    }
}


class Silver implements Mineral {
    public int getValue() {
        return 90;
    }
}

class Bronze implements Mineral {
    public int getValue() {
        return 80;
    }
}


class OreeCalculator {
    static int value = 0;

    public void addValue(Mineral ore) {
        value += ore.getValue();
        System.out.println("광물의 총 가격은 " + value + "원 입니다");
    }
}

public class Quest01 {

    public static void main(String[] args) {
        Gold gold = new Gold();
        Silver silver = new Silver();
        Bronze bronze = new Bronze();

        OreeCalculator calculator = new OreeCalculator();
        calculator.addValue(gold);
        calculator.addValue(silver);
        calculator.addValue(bronze);
    }


}

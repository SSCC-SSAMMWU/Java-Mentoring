package day05;

class SharpPencil {
    private int width;
    private int amount;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}

class BallPen extends SharpPencil {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

class FountainPen extends BallPen {
    public void refill(int n) {
        setAmount(n);
    }

}

public class Quest01 {
    public static void main(String[] args) {
        FountainPen pen03 = new FountainPen();
        pen03.refill(4);
        System.out.println(pen03.getAmount());
    }
}

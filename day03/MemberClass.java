package day03;


class Car {
    String type;
    String owner;

    Car(String carType, String carOwner) {
        type = carType;
        owner = carOwner;
    }

    void printCar() {
        System.out.println("타입 " + type + "의 주인은 " + owner + "씨 입니다");
    }
}
public class MemberClass {
    public static void main(String[] args) {
        Car bus = new Car("버스", "버스주인 김아무개");
        Car truck = new Car("트럭", "트럭주인 홍길동");
        Car normal = new Car("승용차", "승용차주인 김모");

        bus.printCar();
        truck.printCar();
        normal.printCar();
    }
}

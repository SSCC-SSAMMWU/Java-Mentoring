package day02.EvenFiles;

import java.util.HashMap;

public class Quest10 {
    enum CoffieType {
        AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE
        }
    static void printCoffeePrice(HashMap price,CoffieType coffie) {
        System.out.println(String.format(coffie + "의 가격은 " + price.get(coffie) + "원 입니다"));
    }
    public static void main(String[] args) {
        HashMap<CoffieType, Integer> coffiePrice = new HashMap<>();
        coffiePrice.put(CoffieType.AMERICANO, 3000);
        coffiePrice.put(CoffieType.ICE_AMERICANO, 4000);
        coffiePrice.put(CoffieType.CAFE_LATTE, 5000);

        printCoffeePrice(coffiePrice, CoffieType.AMERICANO);
        printCoffeePrice(coffiePrice, CoffieType.ICE_AMERICANO);
        printCoffeePrice(coffiePrice, CoffieType.CAFE_LATTE);
//        printCoffeePrice(99);  // NullPointerException 발생
    }
}

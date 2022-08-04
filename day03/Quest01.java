package day03;

public class Quest01 {
    public static void main(String[] args) {
        String a = "write once, run anywhere";
        if (a.contains("wife")) {
            System.out.println("wife");
        } else if (a.contains("once") && !a.contains("run")) {
            System.out.println("once");
        } else if (!a.contains("everywhere")) {
            System.out.println("everywhere");
        } else if (a.contains("anywhere")) {
            System.out.println("anywhere");
        } else {
            System.out.println("none");
        }

//        예상
//  wife

//        실제
//  everywhere

//      틀린 이유
//  write를 wife로 봐버렸음;

    }
}

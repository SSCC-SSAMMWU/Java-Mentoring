package day02;

public class Quest03 {
    public static void main(String[] args) {
        String pin = "881120-1068234";
        System.out.print("연월일 (YYMMDD) : ");
        System.out.println(pin.substring(0, 6));

        System.out.print("뒷 데이터 : ");
        System.out.println(pin.substring(7));
    }
}

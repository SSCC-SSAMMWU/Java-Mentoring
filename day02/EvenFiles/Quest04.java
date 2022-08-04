package day02.EvenFiles;

public class Quest04 {
    public static void main(String[] args) {
        String pin = "881120-1068234";

        String genderCode = pin.substring(7, 8);
        if (genderCode.contains("1") || genderCode.contains("3")) {
            System.out.println("해당 주민등록본의 주인은 남성입니다");
        } else {
            System.out.println("해당 주민등록본의 주인은 여성입니다");
        }
    }
}

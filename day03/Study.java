package day03;

class Person {
    int age;
    String role;

    // 생성자
    Person(int num, String string) {
        age = num;
        role = string;
    }

    void printRole() {
        System.out.println("저의 역할은 " + role + "입니다");
    }
}

public class Study {
    public static void main(String[] args) {

        Person man01 = new Person(23, "Leader");
        Person man02 = new Person(20, "Student");
        Person man03 = new Person(21, "Student");

        man01.printRole();

    }
}

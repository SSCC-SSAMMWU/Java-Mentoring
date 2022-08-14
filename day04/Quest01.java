package day04;

class TV {
    private String creator;
    private int createDate;
    private int inch;

    public TV(String creator, int createDate, int inch) {
        this.creator = creator;
        this.createDate = createDate;
        this.inch = inch;
    }

    public void getDesc() {
        System.out.println(this.creator + "에서 만든 " + this.createDate + "년형 " + this.inch + "인치 TV");
    }

}

public class Quest01 {
    public static void main(String[] args) {
        TV myTV = new TV("LG", 2017, 32);
        myTV.getDesc();
    }
}

package day04;

class Song {
    private String title;
    private String artist;
    private int year;
    private String country;

    // 기본 생성자..?
    public Song(String title, String artist, int year, String country) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.country = country;
    }

    // 매개변수로 모든 필드를 초기화하는 생성자..?
    public void updateSong(String title, String artist, int year, String country) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.country = country;
    }

    public void show() {
        System.out.println(this.year + "년 " + this.country + "국적의 " + this.artist + "가 부른 " + this.title);
    }
}

public class Quest03 {
    public static void main(String[] args) {
        Song dancingQueen = new Song("Dancing Queen", "ABBA", 1978, "스웨덴");
        dancingQueen.show();
        dancingQueen.updateSong("댄싱 퀸", "ABBA", 1978, "스웨덴");
        dancingQueen.show();
    }
}

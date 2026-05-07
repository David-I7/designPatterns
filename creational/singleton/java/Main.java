package creational.singleton.java;

public class Main {
    public static void main(String[] args) {
        Database database = Database.getInstance();
        Database database2 = Database.getInstance();
    }
}

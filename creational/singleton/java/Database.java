package creational.singleton.java;

public class Database {
    private static volatile Database instance;

    private Database(){
        System.out.println("Constructor called");
    }

    public static Database getInstance() {
        if(instance == null){
            synchronized (Database.class) {
                if (instance == null) {
                    instance = new Database();
                }
            }
        }
        return instance;
    }
}

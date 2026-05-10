package structural.flyweight.java;

public class Main {
    public static void main(String[] args) {
        Forest forest = new Forest();

        for (int i = 0; i < 1000;++i){
            forest.plantTree(i,i,"oak","brown","smooth");
        }
    }
}

package structural.decorator.java.datasources;

public interface DataSource {
    boolean writeData(String data);
    String readData();
}

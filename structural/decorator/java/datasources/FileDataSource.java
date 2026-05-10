package structural.decorator.java.datasources;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDataSource implements DataSource {

    FileWriter writer;
    FileReader reader;

    public FileDataSource(String filename) throws IOException {
        writer = new FileWriter(filename);
        reader = new FileReader(filename);
    }

    @Override
    public boolean writeData(String data) {
        try{
            writer.write(data);
            writer.flush();
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    @Override
    public String readData() {
        try {
            return reader.readAllAsString();
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}


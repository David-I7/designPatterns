package structural.decorator.java;

import structural.decorator.java.datasources.DataSource;
import structural.decorator.java.datasources.FileDataSource;
import structural.decorator.java.decorators.CompressionDecorator;
import structural.decorator.java.decorators.EncryptionDecorator;

import javax.crypto.NoSuchPaddingException;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

public class Main {
    public static void main(String[] args) throws IOException, NoSuchPaddingException, NoSuchAlgorithmException {

        File rootDir = new File(Main.class.getResource("").getPath());
        String compressed = new File(rootDir,"compressed.txt").getAbsolutePath();
        String encrypted = new File(rootDir,"encrypted.txt").getAbsolutePath();

        DataSource compressionDecorator = new CompressionDecorator(new FileDataSource(compressed));
        DataSource encryptionDecorator = new EncryptionDecorator(new FileDataSource(encrypted));

        compressionDecorator.writeData("Hello World");
        System.out.println(compressionDecorator.readData());
        encryptionDecorator.writeData("Hello World");
        System.out.println(encryptionDecorator.readData());
    }
}

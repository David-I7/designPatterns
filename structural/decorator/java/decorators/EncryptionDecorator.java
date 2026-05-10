package structural.decorator.java.decorators;

import structural.decorator.java.datasources.DataSource;

import javax.crypto.NoSuchPaddingException;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class EncryptionDecorator extends DataSourceDecorator{

    public EncryptionDecorator(DataSource dataSource) throws NoSuchPaddingException, NoSuchAlgorithmException   {
        super(dataSource);
    }

    @Override
    public boolean writeData(String data) {
        // Encrypt
        String fakeEncryption = Base64.getEncoder().encodeToString(
                Base64.getEncoder().encodeToString(data.getBytes(StandardCharsets.UTF_8)).getBytes(StandardCharsets.UTF_8));

        return super.writeData(fakeEncryption);
    }

    @Override
    public String readData() {
        String encrypted = super.readData();
        return new String(Base64.getDecoder().decode(Base64.getDecoder().decode(encrypted)));
    }
}


package structural.decorator.java.decorators;

import structural.decorator.java.datasources.DataSource;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class CompressionDecorator extends DataSourceDecorator{
    public CompressionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public boolean writeData(String data) {
        try {
            String compressed = compress(data);
            return super.writeData(compressed);
        }catch (IOException e){
            return false;
        }
    }

    @Override
    public String readData() {
        try {
            String compressed = super.readData();
            return decompress(compressed);
        }catch (IOException e){
            return null;
        }
    }

    private String compress(String str) throws IOException {

        ByteArrayOutputStream bos =
                new ByteArrayOutputStream();

        try (GZIPOutputStream gzip =
                     new GZIPOutputStream(bos)) {

            gzip.write(str.getBytes(StandardCharsets.UTF_8));
        }

        return new String(Base64.getEncoder().encode(bos.toByteArray()));
    }

    private String decompress(String str) throws IOException {

        ByteArrayInputStream bis =
                new ByteArrayInputStream(Base64.getDecoder().decode(str.getBytes(StandardCharsets.UTF_8)));

        ByteArrayOutputStream bos =
                new ByteArrayOutputStream();

        try (GZIPInputStream gzip =
                     new GZIPInputStream(bis)) {

            byte[] buffer = new byte[1024];
            int len;

            while ((len = gzip.read(buffer)) > 0) {
                bos.write(buffer, 0, len);
            }
        }

        return bos.toString(StandardCharsets.UTF_8);
    }
}

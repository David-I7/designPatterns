package structural.facade.java;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        VideoConverter converter = new VideoConverter();
        File mp4 = converter.convert("video.ogg","mp4");
    }
}

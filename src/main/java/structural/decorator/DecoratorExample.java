package structural.decorator;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class DecoratorExample {
    public static void main(String[] args) throws IOException {
        File file = new File("src/main/java/structural/decorator/text_output.txt");

        OutputStream outputStream = new FileOutputStream(file);

        Writer writer = new OutputStreamWriter(outputStream, StandardCharsets.UTF_8);
        writer.write("weeeeeeeeeee");

        writer.close();
        outputStream.close();
    }
}

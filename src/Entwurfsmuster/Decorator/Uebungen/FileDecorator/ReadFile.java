package Entwurfsmuster.Decorator.Uebungen.FileDecorator;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.zip.ZipInputStream;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        //load File
        File fileFile = new File("sample.txt");
        //file to Stream
        InputStream fileStream = new FileInputStream(fileFile);
        // File input stream
        BufferedInputStream fileInputStream = new BufferedInputStream(fileStream);
        System.out.println(new String(fileInputStream.readAllBytes(), StandardCharsets.ISO_8859_1));

        //load File
        File zipFile = new File("sample.zip");
        //file to Stream
        InputStream zipStream = new FileInputStream(zipFile);
        // zip input stream
        ZipInputStream zipInputStream = new ZipInputStream(zipStream);
        System.out.println(new String(zipInputStream.readAllBytes(), StandardCharsets.ISO_8859_1));
    }
}

package com.sourceit.kopiichenko.l9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Helps read text-files by strings.
 */
public class TextFileReader {

    private String fileName;

    TextFileReader() {
        this.fileName = "D:/Java_practice/java_course_kopiichenko/homework/src/main/resources/l9/Myfile.txt";
    }

    /**
     * Reads text-files by strings.
     */
    public void readFile1() {
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            stream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        TextFileReader textFileReader = new TextFileReader();
        textFileReader.readFile1();
    }
}

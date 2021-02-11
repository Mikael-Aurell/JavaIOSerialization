package se.lexicon.fileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class CSVReader_Writer {

    public static String readText (File source) {
        StringBuilder readText = new StringBuilder();
        try (
                FileReader reader = new FileReader(source)
        ) {
            int i;
            while ((i = reader.read()) != -1) {
                char letter = (char) i;
                readText.append(letter);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return readText.toString();
    }

    public static List<String> readNames(File source) {
        List<String> strings = new ArrayList<>();
    try (BufferedReader reader= new BufferedReader(new FileReader(source))) {
        String line;
            while((line= reader.readLine()) != null) {
                strings.add(line);
            }
    } catch(IOException e) {
        e.printStackTrace();
    }
    return strings;
    }
}

package se.lexicon.fileIO;

import se.lexicon.model.Car;

import java.io.*;
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

    public static List<String> writeStringToTextFile (File destination, List<String> source){
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destination))) {
            for (String writeTo : source) {
                bufferedWriter.write(writeTo);
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return source;
    }

    public static void copyFile(File source, File destination){
        try(
                BufferedInputStream in = new BufferedInputStream(new FileInputStream(source));
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(destination))
                ) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while((bytesRead = in.read(buffer)) > 0 ){
                out.write(buffer,0,bytesRead);
                out.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveToFile (List<Car> source, String filePath){
        try(
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath))
        ){
            objectOutputStream.writeObject(source);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Car> saveToList (String filePath){
        try(
                ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath));
        ){
            List<Car> destination = (List<Car>) objectInputStream.readObject();

            return destination;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }


}

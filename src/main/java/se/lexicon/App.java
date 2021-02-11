package se.lexicon;


import java.io.File;

import static se.lexicon.fileIO.CSVReader_Writer.readText;
import static se.lexicon.fileIO.CSVReader_Writer.readNames;


public class App
{
    public static void main( String[] args )
    {
        //Exercise 1
        File file = new File("content.txt");
        String fileContent = readText(file);
        System.out.println(fileContent);

        //Exercise 2
        File names = new File("names.txt");
        for (String string : readNames(names)){
            System.out.println(string);
        }
    }
}

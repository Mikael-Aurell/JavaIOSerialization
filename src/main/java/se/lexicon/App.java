package se.lexicon;


import se.lexicon.fileIO.CSVReader_Writer;
import se.lexicon.model.Car;
import se.lexicon.model.Name;
import se.lexicon.model.Owner;
import se.lexicon.util.JsonIOUtil;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static se.lexicon.fileIO.CSVReader_Writer.*;


public class App
{
    public static void main( String[] args )
    {
        //Exercise 1
        /*File file = new File("content.txt");
        String fileContent = readText(file);
        System.out.println(fileContent);*/

        //Exercise 2
        /*File names = new File("names.txt");
        for (String string : readNames(names)){
            System.out.println(string);
        }*/

        //Exercise 3
        /*List<String> stringList = new ArrayList<>();

        stringList.add("Mikael");
        stringList.add("Daniel");
        stringList.add("Julia");
        stringList.add("Edward");
        stringList.add("Sixten");

        File url = new File("writeStringsfromList.txt");
        writeStringToTextFile(url, stringList);*/

        //Exercise 4
        /*File source = new File("writeStringsfromList.txt");
        File destination = new File("copy_of_writeStringsfromList.txt");
        CSVReader_Writer.copyFile(source, destination);*/

        //Exercise 5b)
        /*ArrayList <Car> cars = new ArrayList<>();
        Car citroen = new Car("ABC123", "Citroen", "C3", "2018-03-11)");
        Car volvo = new Car("DEF456", "Volvo", "V60", "2019-06-12)");
        Car porsche = new Car("LOL246", "Porsche", "Targa", "2018-08-01)");
        cars.add(citroen);
        cars.add(volvo);
        cars.add(porsche);

        saveToFile(cars, "exercise5Cars.ser");*/

        //Exercise 5c)
        /*String filePath = "exercise5Cars.ser";
        List<Car> listOfCars = CSVReader_Writer.saveToList(filePath);
        for (Car car : listOfCars){
            System.out.println(car.toString());
        }*/

        //Exercise 6
        ArrayList<Owner> owners = new ArrayList<Owner>();
        Owner owner1 = new Owner("Mikael", "2020-03-06");
        Owner owner2 = new Owner("Klara", "1978-03-05");
        Owner owner3 = new Owner("Bengt", "1968-07-07");

        owners.add(owner1);
        owners.add(owner2);
        owners.add(owner3);

        ArrayList <Car> cars = new ArrayList<>();
        Car citroen = new Car("XXX009", "Citroen", "C3", "2018-03-11)", owner1);
        Car volvo = new Car("YYL535", "Saab", "9000", "2019-06-12)", owner2);
        Car porsche = new Car("GRR279", "Lada", "R", "2018-08-01)", owner3);
        cars.add(citroen);
        cars.add(volvo);
        cars.add(porsche);

        JsonIOUtil util= new JsonIOUtil();

        File file = new File("cars.json");
        util.serializeCarListToJson(cars, file);

        List<Car> carList = util.deserializeJsonListToCar(file);
        System.out.println(carList.toString());
    }
}

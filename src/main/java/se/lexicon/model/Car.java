package se.lexicon.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

public class Car implements Serializable {

    private UUID carId;
    private String regNumber;
    private String brand;
    private String model;
    private String regDate;
    private Owner owner;

    public Car() {
        this.carId = UUID.randomUUID();
    }

    public Car(String regNumber, String brand, String model, String regDate) {
        this.carId = UUID.randomUUID();
        this.regNumber = regNumber;
        this.brand = brand;
        this.model = model;
        this.regDate = regDate;
    }

    public Car(String regNumber, String brand, String model, String regDate,Owner owner) {
        this.carId = UUID.randomUUID();
        this.regNumber = regNumber;
        this.brand = brand;
        this.model = model;
        this.regDate = regDate;
        this.owner = owner;
    }

    public UUID getCarId() {
        return carId;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", regNumber='" + regNumber + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", regDate='" + regDate + '\'' +
                ", owner=" + owner +
                '}';
    }

    /*@Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", regNumber='" + regNumber + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", regDate='" + regDate + '\'' +
                '}';
    }*/
}

package se.lexicon.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

public class Car implements Serializable {

    private UUID carId;
    private String regNumber;
    private String brand;
    private String model;
    private LocalDate regDate;
    private Owner owner;
}

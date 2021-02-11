package se.lexicon.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

public class Owner implements Serializable {
    private UUID ownerId;
    private String name;
    private LocalDate birthdate;
}

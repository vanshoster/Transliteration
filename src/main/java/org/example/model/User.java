package org.example.model;

public class User {
    private String firstName;
    private String middleName;
    private String lastName;
    private String transliteratedFirstName;
    private String transliteratedMiddleName;
    private String transliteratedLastName;

    public User() {
        this.firstName = "";
        this.middleName = "";
        this.lastName = "";
    }

    public User(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTransliteratedFirstName() {
        return transliteratedFirstName;
    }

    public void setTransliteratedFirstName(String transliteratedFirstName) {
        this.transliteratedFirstName = transliteratedFirstName;
    }

    public String getTransliteratedMiddleName() {
        return transliteratedMiddleName;
    }

    public void setTransliteratedMiddleName(String transliteratedMiddleName) {
        this.transliteratedMiddleName = transliteratedMiddleName;
    }

    public String getTransliteratedLastName() {
        return transliteratedLastName;
    }

    public void setTransliteratedLastName(String transliteratedLastName) {
        this.transliteratedLastName = transliteratedLastName;
    }
}

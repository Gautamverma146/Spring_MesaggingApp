package com.Capgemini.springintro.dto;

public class DtoPost {
String firstName;
String lastName;

    public DtoPost(String firstName, String lastName) {
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

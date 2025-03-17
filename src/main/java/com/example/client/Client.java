package com.example.client;

public class Client {

    private int id;
    private String firstName;
    private String lastName;
    private String middleName;
    private String email;
    private String phone;
    private String birthdate;
    private boolean isActive;

    public Client(int id, String firstName, String lastName, String middleName, String email,
        String phone, String birthdate, boolean isActive) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.email = email;
        this.phone = phone;
        this.birthdate = birthdate;
        this.isActive = isActive;
    }

    /**
     * Организовываем правила изменения полей
     */
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}

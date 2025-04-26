package com.example.client;

import com.example.bank.AnalyticalAccount;
import com.example.bank.BankCard;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Client {

    private int idClient;
    private String firstName;
    private String lastName;
    private String middleName;
    private String email;
    private String phone;
    private String birthdate;
    private boolean isActive;
      private AnalyticalAccount analyticalAccount;

    public Client(int idClient, String firstName, String lastName, String middleName, String email,
        String phone, String birthdate, boolean isActive) {
        this.idClient = idClient;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.email = email;
        this.phone = phone;
        this.birthdate = birthdate;
        this.isActive = isActive;
        this.analyticalAccount = new AnalyticalAccount(idClient, idClient + "ACCT"); // имя аккаунта - автоматически сформировано
    }

    public void enrollNewCard(String cardId, String period, String pin)
    {
        this.analyticalAccount.addCard(cardId, period, pin);
    }


    public String getFirstName(int id) {
        return firstName;
    }

    public String getLastName(int id) {
        return lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public List<BankCard> getBankCardList(int id) {
        return analyticalAccount.getBankCardList();
    }

    public Double getBalance() {
        return analyticalAccount.getBalance();
    }
}

package com.example.client;

import com.example.bank.AnalyticalAccount;
import com.example.bank.BankCard;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Client {

    private int idClient;
    private double clientBalance;
    private String firstName;
    private boolean isActive;
    private AnalyticalAccount analyticalAccount;

    public Client(int idClient, String firstName, boolean isActive) {
        this.idClient = idClient;
        this.firstName = firstName;
        this.isActive = isActive;
        this.analyticalAccount = new AnalyticalAccount(idClient,
            clientBalance);
    }

    public void enrollNewCard(String cardId) {
        this.analyticalAccount.addCard(cardId);
    }


    public String getFirstName(int id) {
        return firstName;
    }

    public List<BankCard> getBankCardList(int id) {
        return analyticalAccount.getBankCardList();
    }

    public Double getBalance() {
        return analyticalAccount.getBalance();
    }
}

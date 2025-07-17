package com.example.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Аналитический счет клиента, содержит основной баланс клиента
 */
public class AnalyticalAccount {

    private int clientID;
    private Double clientBalance;
    private String number;
    private List<BankCard> bankCardList;

    public AnalyticalAccount(int clientID, Double clientBalance) {
        //
        // Создать пустой список карт, привязанных к данному счету
        //
        List<BankCard> bankCardList = new ArrayList<>();
        //
        // Заполнить остальные поля
        //
        this.clientID = clientID;
        this.clientBalance = 0.0; // изначально счет пустой, на нем нет денег
    }

    public double getBalance() {
        return this.clientBalance;
    }


    public void deposit(double amount) {
        this.clientBalance += amount;
    }


    public void withdraw(double amount) throws Exception {
        // овердрафт запрещен
        if (this.clientBalance - amount < 0) {
            throw new Exception("Овердрафт");
        }
        this.clientBalance -= amount;
    }

    public void addCard(String cardNumber) {
        BankCard newCard = new BankCard(cardNumber);
        this.bankCardList.add(newCard);
    }


    public String getNumber() {
        return number;
    }

    public List<BankCard> getBankCardList() {
        return this.bankCardList;
    }

    public void setClientBalance(Double clientBalance) {
        this.clientBalance = clientBalance;
    }

}

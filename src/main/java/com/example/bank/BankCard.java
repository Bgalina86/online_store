package com.example.bank;

import java.util.Collection;
import java.util.Iterator;

/**
 * Банковская карта клиента, может быть привязана к аналитическому счету, не содержит собственный
 * баланс
 */
public class BankCard  {

    private String cardNumber;
    private String implementationPeriod;
    private String pin;
    private int idClient;


    public BankCard(String cardNumber, String implementationPeriod, String pin) {
        this.cardNumber = cardNumber;
        this.implementationPeriod = implementationPeriod;
        this.pin = pin;
    }

    public String getCardNumber() {
        return cardNumber;
    }
    public String getImplementationPeriod() {
        return implementationPeriod;
    }

    public String getPin() {
        return pin;
    }
    public void setPin(String pin) {
        this.pin = pin;
    }

    /*
    public void addBankCard(int idClient, String cardNumber, String implementationPeriod, String pin){

    }
     */

}

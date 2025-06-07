package com.example.bank;


/**
 * Банковская карта клиента, может быть привязана к аналитическому счету, не содержит собственный
 * баланс
 */
public class BankCard  {

    private String cardNumber;
    private String implementationPeriod;
    private String pin;



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
}

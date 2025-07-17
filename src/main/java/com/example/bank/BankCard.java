package com.example.bank;


/**
 * Банковская карта клиента, может быть привязана к аналитическому счету, не содержит собственный
 * баланс
 */
public class BankCard {

    private String cardNumber;


    public BankCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

}

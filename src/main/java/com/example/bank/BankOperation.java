package com.example.bank;

/**
 * Банковская операция, содержит методы взаимодействия со счетом клиента: списание средств, выписка
 * с аналитического счета
 */
public class BankOperation extends BankCard {

    private int balanceClients;

    public BankOperation(String cardNumber, String implementationPeriod, String pin) {
        super(cardNumber, implementationPeriod, pin);
    }

    public int debitingFunds(int pay) {
        int itog = balanceClients - pay;
        return itog;
    }

    public int receivingFunds(int receive) {
        int itog = balanceClients + receive;
        return itog;
    }

    public void printItogBalance(int pay, int receive) {
        int itogDebiting = debitingFunds(pay);
        int itogReceiving = receivingFunds(receive);
        System.out.println("Списано со счета" + itogDebiting + "Поступило на счет" + itogReceiving);
    }
}

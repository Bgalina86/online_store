package com.example.bank;

/**
 * Банковская операция, содержит методы взаимодействия со счетом клиента: списание средств, выписка
 * с аналитического счета
 */
public class BankOperation extends BankCard {

    private int balanceClients;

    public BankOperation(String cardNumber) {
        super(cardNumber);
    }

    public int debitingFunds(int pay) {
        int result = balanceClients - pay;
        return result;
    }

    public int receivingFunds(int receive) {
        int result = balanceClients + receive;
        return result;
    }

    public void printResultBalance(int pay, int receive) {
        int resultDebiting = debitingFunds(pay);
        int resultReceiving = receivingFunds(receive);
        System.out.println("Списано со счета" + resultDebiting + "Поступило на счет" + resultReceiving);
    }
}

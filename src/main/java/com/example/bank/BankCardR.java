package com.example.bank;
/**
 * Банковская карта клиента, может быть привязана к аналитическому счету, не содержит собственный
 * баланс
 */


public record BankCardR(int idClient, String cardNumber, String implementationPeriod, String pin) {

}

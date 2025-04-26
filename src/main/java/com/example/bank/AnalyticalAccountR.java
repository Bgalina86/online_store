package com.example.bank;

/**
 * Аналитический счет клиента, содержит основной баланс клиента
 */

public record AnalyticalAccountR(int idClient, String bankAnalyticalAccountNumber, Double balanceClients)
{
}

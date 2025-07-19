package com.example.bank;

import com.example.client.Client;
import java.util.HashMap;
import java.util.Map;

/**
 * База данных о клиентах банка, данные аналитических счетов, банковских карт. Обязательное условие
 * - к одному аналитическому счету может быть привязано несколько банковских карт. Коллекция счетов
 */
public class ClientDB {

    public void clientDB() {
        /**
         * Таблица данных Client
         */
        Client client1 = new Client(1, "Ivan", true);
        Client client2 = new Client(2, "Vasa",  true);

        /**
         * Таблица ClientBank
         */
        Map<Client, BankCard> clientBankCard = new HashMap<>();

        /**
         * Список карт клиента
         */
        clientBankCard.put(client1, new BankCard("123654"));
        clientBankCard.put(client2, new BankCard("456787"));

        /**
         * Таблица balanceClients баланс клиента
         */

      AnalyticalAccount analyticalAccount1 = new AnalyticalAccount(1, 8000.50);
      AnalyticalAccount analyticalAccount2 = new AnalyticalAccount(2, 100.50);

    }

}

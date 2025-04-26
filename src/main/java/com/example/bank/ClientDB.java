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
        Client client1 = new Client(1, "Ivan", "Ivanov", "Ivanovich", "emalivan@trfg.ru",
            "+78989898989", "24.05.2000", true, new AnalyticalAccount(1, "12456", 4578136.56,
            new BankCard("4578", "20.10.2055", "124")));
        Client client2 = new Client(2, "Vasa", "Vetrov", "Ivanovich", "vetrov@trfg.ru",
            "+78787877778", "15.05.1999", true, new AnalyticalAccount(2, "12365", 45785465.12,
            new BankCard("458963", "20.10.2066", "452")));

        /**
         * Таблица ClientBank
         */
        Map<Client, BankCard> clientBankCard = new HashMap<>();

        /**
         * Список карт клиента
         */
        clientBankCard.put(client1, new BankCard("123654", "20.12.2056","156"));
        clientBankCard.put(client2, new BankCard("456787", "24.03.2058","453"));

        /**
         * Добавляем информацию о карточках клиента
         */
//        List<BankCard> cardList = new ArrayList<>();
//        client1.addBankCard(new BankCard("123412345", "12.05.2035", "1243"));
//        client1.addBankCard(new BankCard("145786421", "12.06.2035", "1243"));
//        client1.addBankCard(new BankCard("145781256", "12.07.2035", "1243"));
//
//        client2.addBankCard(new BankCard("457841555", "12.05.2035", "1243"));
        /**
         * Таблица balanceClients баланс клиента
         */

      //  AnalyticalAccount analyticalAccount1 = new AnalyticalAccount(1, "123", 200000.23);

    }

}

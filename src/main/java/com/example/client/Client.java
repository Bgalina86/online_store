package com.example.client;

import com.example.bank.AnalyticalAccount;
import com.example.bank.BankCard;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClientNew {

    private int id;
    private String firstName;
    private String lastName;
    private String middleName;
    private String email;
    private String phone;
    private String birthdate;
    private boolean isActive;
    private List<BankCard> bankCardList;
    private BankCard bankCard;
    private AnalyticalAccount analyticalAccount;
    private String bankAnalyticalAccountNumber;
    private Double balanceClients;
    private String cartNumber;
    private String implementationPeriod;
    private String pin;

    public ClientNew(int id, String firstName, String lastName, String middleName, String email,
        String phone, String birthdate, boolean isActive, AnalyticalAccount analyticalAccount) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.email = email;
        this.phone = phone;
        this.birthdate = birthdate;
        this.isActive = isActive;
        this.analyticalAccount = new AnalyticalAccount(id, bankAnalyticalAccountNumber,
            balanceClients, new BankCard(cartNumber, implementationPeriod, pin));
       // this.bankCard = new BankCard(cartNumber, implementationPeriod, pin);
    }
    //Добавление карт в список клиента



    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public List<BankCard> getBankCardList() {
        return analyticalAccount.getBankCardList();
    }

    public Double getBalanceAnalyticalAccount(int id) {
        return analyticalAccount.getBalanceClients(id);
    }

    public void addBankCardInBankListClient(BankCard bankCard) {
        /**
         * Таблица ClientBank
         */
        //ClientNew client = ClientNew()
        Map<ClientNew, BankCard> clientBankCard = new HashMap<>();

        /**
         * Список карт клиента
         */
        //ClientNew сlient = ClientNew.this.;
       // clientBankCard.put(сlient, new BankCard("123654", "20.12.2056","156"));

        this.bankCardList.add(bankCard);
    }



}

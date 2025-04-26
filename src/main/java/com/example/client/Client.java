package com.example.client;

import com.example.bank.AnalyticalAccount;
import com.example.bank.BankCard;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Client {

    private int idClient;
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

    public Client(int idClient, String firstName, String lastName, String middleName, String email,
        String phone, String birthdate, boolean isActive, AnalyticalAccount analyticalAccount) {
        this.idClient = idClient;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.email = email;
        this.phone = phone;
        this.birthdate = birthdate;
        this.isActive = isActive;
        this.analyticalAccount = new AnalyticalAccount(idClient, bankAnalyticalAccountNumber,
            balanceClients, new BankCard(cartNumber, implementationPeriod, pin));
       // this.bankCard = new BankCard(cartNumber, implementationPeriod, pin);
    }
    //Добавление карт в список клиента

    public Client Client(int idClient){

        return (Client) List.of(idClient, firstName, lastName, middleName, email,
            phone, birthdate, isActive, analyticalAccount);
    }
    public String getFirstName(int id) {
        return firstName;
    }

    public String getLastName(int id) {
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

    public List<BankCard> getBankCardList(int id) {
        return analyticalAccount.getBankCardList();
    }

    public Double getBalanceAnalyticalAccount(int id) {
        return analyticalAccount.getBalanceClients(id);
    }

    public void addBankCardInBankListClient(BankCard bankCard) {
        Map<Client, BankCard> clientBankCard = new HashMap<>();
       clientBankCard.put(Client(idClient), new BankCard(cartNumber, implementationPeriod,pin));

        this.bankCardList.add(bankCard);
    }




}

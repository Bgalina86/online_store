package com.example.client;

import com.example.bank.AnalyticalAccount;
import com.example.bank.AnalyticalAccountR;
import com.example.bank.BankCard;
import com.example.bank.BankCardR;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClientR {
    private int idClient;
    private String firstName;
    private String lastName;
    private String middleName;
    private boolean isActive;
    private List<BankCardR> bankCardList;
    private BankCard bankCard;
    private AnalyticalAccountR analyticalAccountR;
    private String bankAnalyticalAccountNumber;
    private Double balanceClients;
    private String cardNumber;
    private String implementationPeriod;
    private String pin;


    public ClientR(int idClient, String firstName, String lastName, String middleName,
        boolean isActive,     AnalyticalAccountR analyticalAccountR)
    {
        this.idClient = idClient;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.isActive = isActive;
        //this.bankCardList = new ArrayList<BankCardR>();
        //this.bankCard = bankCard;
        this.analyticalAccountR = new AnalyticalAccountR(idClient,
            bankAnalyticalAccountNumber, balanceClients);


    }

    /**
     * Метод добавления банковской карты в список карт клиента и связки с аналитическим счетом
     * @param idClient
     * @param cardNumber
     * @param implementationPeriod
     * @param pin
     */
   public void addBankCardToList(int idClient,String cardNumber,String implementationPeriod, String pin){
       Map<AnalyticalAccountR,BankCardR> analyticalAccountRBankCardRMap = new HashMap<>();
       AnalyticalAccountR analyticalAccountR = new AnalyticalAccountR(idClient,bankAnalyticalAccountNumber,balanceClients);
       List<BankCardR> bankCardList = Collections.singletonList(
           analyticalAccountRBankCardRMap.put(analyticalAccountR,
               (new BankCardR(idClient, cardNumber, implementationPeriod, pin))));
   }


    /**
     *
     * @param idClient
     * @param cardNumber
     * @param implementationPeriod
     * @param pin
     */
    public void addBankCardList(int idClient,String cardNumber,String implementationPeriod, String pin){
    List<BankCard> bankCardListClient = new ArrayList<>();
    ClientR clientR = new ClientR(idClient,firstName,lastName,middleName,isActive, new AnalyticalAccountR(idClient,bankAnalyticalAccountNumber,balanceClients));
    //clientR.a
    }

}

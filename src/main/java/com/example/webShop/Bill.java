package com.example.webShop;

/**
 * кассовый чек с выводом информации о покупке и успешности оплаты
 */
public class Bill {
    String productName;
    int quantityOfGoods;
    Double costOfGoods;
    Double totalCostOfGoods;
    boolean purchaseResult;

    public Bill(String productName, int quantityOfGoods, Double costOfGoods) {
        this.productName = productName;
        this.quantityOfGoods = quantityOfGoods;
        this.costOfGoods = costOfGoods;
    }

    public Bill(Double totalCostOfGoods, boolean purchaseResult) {
        this.totalCostOfGoods = totalCostOfGoods;
        this.purchaseResult = purchaseResult;
    }

    public Double getTotalCostOfGoods() {
        return totalCostOfGoods;
    }

    public boolean isPurchaseResult() {
        return purchaseResult;
    }

    //вывод по чеку
}

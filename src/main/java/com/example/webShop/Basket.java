package com.example.webShop;

/**
 * корзина товаров
 */
public class Basket {
    String productName;
    int quantityOfGoods;
    Double costOfGoods;
    Double totalCostOfGoods;

    public Basket(String productName, int quantityOfGoods, Double costOfGoods) {
        this.productName = productName;
        this.quantityOfGoods = quantityOfGoods;
        this.costOfGoods = costOfGoods;
    }

    public Basket(Double totalCostOfGoods) {
        this.totalCostOfGoods = totalCostOfGoods;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantityOfGoods() {
        return quantityOfGoods;
    }

    public Double getCostOfGoods() {
        return costOfGoods;
    }

    public Double getTotalCostOfGoods() {
        return totalCostOfGoods;
    }
}

package com.example.webShop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Кассовый чек с выводом информации о покупке и успешности оплаты
 */
public class Bill {
    private String productName;
    private int quantityOfGoods;
    private Double costOfGoods;
    private Double totalCostOfGoods; // Общая стоимость товара
    private boolean purchaseResult;
    private double priceProduct;

    public Bill(String productName, int quantityOfGoods, Double costOfGoods) {
        this.productName = productName;
        this.quantityOfGoods = quantityOfGoods;
        this.costOfGoods = costOfGoods;
    }

//    public Bill(Double totalCostOfGoods, boolean purchaseResult) {
//        this.totalCostOfGoods = totalCostOfGoods;
//        this.purchaseResult = purchaseResult;
//    }

    public Double getTotalCostOfGoods() {
        return totalCostOfGoods;
    }

    public boolean isPurchaseResult() {
        return purchaseResult;
    }

    //вывод по чеку
    //г) Покупатель получает чек магазина
    // *  со списком приобретенных товаров, их суммой и результатом оплаты
//    public Object billMagListGoods(){
//        Goods goods = new Goods(productName,quantityOfGoods,priceProduct);
//
//        List<Goods> goodsListBill = new ArrayList<>(Arrays.toString())
//    }


    public String toStringGoods() {
        return "Bill{" +
            "Наименование товара = " + productName + '\'' +
            ", Количество товара = " + quantityOfGoods +
            ", Стоимость товара за шт. = " + costOfGoods +
            ", Общая стоимость товаров = " + totalCostOfGoods +
            '}';
    }
    public String toStringResult() {

        //Посчитать кол-во товаров.
        //Посчитать сумму по чеку

        return "Bill{" +
            "Итоговая сумма по чеку = " + purchaseResult + '\'' +
            ", Количество товара = " + quantityOfGoods +
            ", Стоимость товара за шт. = " + costOfGoods +
            ", Общая стоимость товаров = " + totalCostOfGoods +
            '}';
    }

}

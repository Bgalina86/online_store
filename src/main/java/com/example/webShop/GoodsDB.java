package com.example.webShop;

import java.util.ArrayList;
import java.util.List;

/**
 * база данных товаров в интернет-магазине, их наличии
 * https://github.com/Bgalina86/Inopolis.lesson/blob/main/src/main/java/Homework6Collection/Tassk_4_CompanyMovie/Task4NestedList.java
 * Коллекция данных
 */
public class GoodsDB {

    public void product() {

        List<Goods> goodsList = new ArrayList<>();
        goodsList.add(new Goods("Груша", 5, 45.5));
        goodsList.add(new Goods("Яблоко", 10, 50.5));
        goodsList.add(new Goods("Банан", 15, 55.5));
        goodsList.add(new Goods("Киви", 5, 25.5));
        goodsList.add(new Goods("Ананас", 5, 78.5));
        goodsList.add(new Goods("Апельсин", 5, 45.5));
        goodsList.add(new Goods("Лимон", 5, 45.5));
        goodsList.add(new Goods("Виноград", 5, 45.5));
        goodsList.add(new Goods("Абрикос", 0, 45.5));
    }
}

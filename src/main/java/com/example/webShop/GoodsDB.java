package com.example.webShop;

import java.util.HashMap;
import java.util.Map;

/**
 * База данных товаров в интернет-магазине, их наличии
 * https://github.com/Bgalina86/Inopolis.lesson/blob/main/src/main/java/Homework6Collection/Tassk_4_CompanyMovie/Task4NestedList.java
 * Коллекция данных
 */
public class GoodsDB {

    private static Map<Goods,Integer> goodsMap = new HashMap<>() {{
        put(new Goods("Груша",  45.5),5);
        put(new Goods("Яблоко",  50.5),10);
        put(new Goods("Банан",  55.5),15);
        put(new Goods("Киви", 25.5),5);
        put(new Goods("Ананас",  78.5),5);
        put(new Goods("Апельсин",  45.5),5);
        put(new Goods("Лимон",  45.5),5);
        put(new Goods("Виноград", 45.5),5);
        put(new Goods("Абрикос",  45.5),0);
    }};

    public Goods getGoods(String productName, int quantityOfProduct) {
        Goods goods = null;
        for (Map.Entry<Goods, Integer> oneGoods : goodsMap.entrySet()) {
            if (oneGoods.getKey().productName.equals(productName) && oneGoods.getValue() <= quantityOfProduct) {
                goods = oneGoods.getKey();
            }
        }
        if(!goods.equals(null)){
            goodsMap.put(goods,goodsMap.get(goods) - quantityOfProduct);
        }
        return goods;
    }

}

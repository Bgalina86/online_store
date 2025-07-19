package com.example.webShop;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Корзина товаров
 * б) Магазин предоставляет информацию о наличии товара и сумме к оплате собранной
 * *  покупателем корзины. Если товары отсутствуют - необходимо уведомить покупателя и исключить
 * *  товары из корзины.
 * в) Покупатель оплачивает покупку картой, которая привязана к счету баланса
 * *  на его аналитическом счету - проверяется успешность транзакции, достаточно ли средств
 * *  для оплаты - в случае успеха - покупка оплачивается
 */
public class Basket {

    private Map<Goods,Integer> productName;
   
    private Double totalCostOfGoods;


    public Basket() {
        this.productName = new HashMap<>();
    }

    public void addToBasket(Goods goods, int quantityOfGoods){

        if (quantityOfGoods > GoodsDB.getGoods.)
    }
























   // public String getProductName() {
//        return productName;
//    }


    /**
     * Наличие товара
     *
     * @param quantityOfGoods количество товара
     * @return
     */
    public Serializable getQuantityOfGoods(double quantityOfGoods) {
        if (quantityOfGoods > 0) {
            return quantityOfGoods;
        }
        if (quantityOfGoods < 0) {
            return new IllegalArgumentException("Товар отсутствует");
        }
        return quantityOfGoods;
    }

    /**
     * Стоимость товара за штуку
     *
     * @return
     */
    public Serializable getCostOfGoods(String productName, int quantityOfProduct) {
        Goods goods = new Goods(productName, quantityOfProduct);
        double costOfGoods = goods.priceProduct;
        if (goods.quantityOfProduct == 0) {
            return new IllegalArgumentException("Товар отсутствует");
        }

        return costOfGoods;
    }

    /**
     * Стоимость товара за все количество товара одного типа. Выводим список
     *
     * @return
     */
    public double getTotalCostOfGoods(String productName, double quantityOfProduct) throws Exception {
        double costOfGoods = (double) getCostOfGoods(productName);
        Goods goods = new Goods(productName, quantityOfGoods, priceProduct);
        totalCostOfGoods = costOfGoods * quantityOfProduct;
        if ((goods.quantityOfProduct == 0) || (goods.quantityOfProduct < 0) ) throw new Exception("Товар отсутствует в таком количестве");

        return totalCostOfGoods;
    }

    /**
     * Формирование списка покупок
     */
    public void listGoodsPay(String productName, double quantityOfProduct) throws Exception {
        Map<Goods, Double> listGoodsPayTotal = new HashMap<>();
        Goods goods = new Goods(productName,quantityOfGoods,priceProduct);
        listGoodsPayTotal.put(goods,getTotalCostOfGoods(productName, quantityOfGoods));
    }

    /**
     * Списываем со счета. Проверка на доступность средств
     */
    public void makingPurchase(double quantityOfProduct) throws Exception {
        //формируем весь список товаров и подсчитываем сумму покупки
        Map<Goods, Double> listGoodsPayTotal = new HashMap<>();
        Goods goods = new Goods(productName,quantityOfGoods,priceProduct);
        listGoodsPayTotal.put(goods,getTotalCostOfGoods(productName, quantityOfGoods));
        ArrayList<Double> all = new ArrayList<>(listGoodsPayTotal.values());
       Double summAll = all.stream().reduce((x,y) -> x+y).get();

        //проверяем хватает ли средств
    }
    // уменьшаем баланс при покупке
    // уменьшаем кол-во продуктов в БД
/**
 * б) Магазин предоставляет информацию о наличии товара
 * и сумме к оплате собранной
 *   покупателем корзины. Если товары отсутствуют - необходимо уведомить покупателя и исключить
 *   товары из корзины.
 * в) Покупатель оплачивает покупку картой, которая привязана к счету баланса
 *   на его аналитическом счету - проверяется успешность транзакции, достаточно ли средств
 *  для оплаты - в случае успеха - покупка оплачивается
 * */


}

package com.example.webShop;

import java.util.Objects;

/**
 * Класс, описывающий товар
 */
public class Goods {

    String productName;
  //  int quantityOfProduct;
    double priceProduct;


    public Goods(String productName,  double priceProduct) {
        this.productName = productName;

        this.priceProduct = priceProduct;

    }

    public String getProductName() {
        return productName;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    @Override
    public String toString() {
        return "Goods{" +
            "nameProduct='" + productName + '\'' +
            ", priceProduct=" + priceProduct +
            '}';
    }
}

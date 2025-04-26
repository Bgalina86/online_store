package com.example.webShop;

import java.util.Objects;

/**
 * Класс, описывающий товар
 */
public class Goods {

    String nameProduct;
    int quantityOfProduct;
    double priceProduct;
    boolean productAvailability;// убрать

    public Goods(String nameGood, int quantityOfGood, double priceGood) {
        this.nameProduct = nameProduct;
        this.quantityOfProduct = quantityOfProduct;
        this.priceProduct = priceProduct;
        this.productAvailability = productAvailability;
    }

    public Goods() {
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public int getQuantityOfProduct() {
        return quantityOfProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setProductAvailability(boolean productAvailability) {
        this.productAvailability = productAvailability;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Goods goods = (Goods) o;
        return quantityOfProduct == goods.quantityOfProduct
            && Double.compare(priceProduct, goods.priceProduct) == 0
            && productAvailability == goods.productAvailability && Objects.equals(nameProduct,
            goods.nameProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameProduct, quantityOfProduct, priceProduct, productAvailability);
    }

    @Override
    public String toString() {
        return "Goods{" +
            "nameProduct='" + nameProduct + '\'' +
            ", quantityOfProduct=" + quantityOfProduct +
            ", priceProduct=" + priceProduct +
            ", productAvailability=" + productAvailability +
            '}';
    }
}

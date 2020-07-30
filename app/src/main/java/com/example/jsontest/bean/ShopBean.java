package com.example.jsontest.bean;

/**
 * @author : BenjaminHe
 * @date : 2020-07-28 17:58
 * @desc :商品封装类
 */
public class ShopBean {
    private String shopName;
    private double shopPrice;
    private int shopId;

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public double getShopPrice() {
        return shopPrice;
    }

    public void setShopPrice(double shopPrice) {
        this.shopPrice = shopPrice;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }
}

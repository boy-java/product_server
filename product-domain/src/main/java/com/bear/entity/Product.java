package com.bear.entity;

/**
 * @Author XiaoXiong.Li
 * @Date 23:23 2020/5/19 
 */
public class Product {
    private int id;
    private String name;
    private String price;
    private String store;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }
}
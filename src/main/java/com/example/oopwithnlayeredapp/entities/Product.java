package com.example.oopwithnlayeredapp.entities;

public class Product {
    private int id;
    private String name;
    private double unitprice;

    public Product() {

    }

    public Product(int id,String name,double unitprice) {

        this.id = id;
        this.name=name;
        this.unitprice=unitprice;
    }

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

    public double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(double unitprice) {
        this.unitprice = unitprice;
    }
}

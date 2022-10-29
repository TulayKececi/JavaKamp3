package com.example.oopwithnlayeredapp;

import com.example.oopwithnlayeredapp.business.ProductManager;
import com.example.oopwithnlayeredapp.dataAccess.JdbcProductDao;
import com.example.oopwithnlayeredapp.entities.Product;

public class main {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1,"iphone",1000);
        ProductManager productManager = new ProductManager(new JdbcProductDao());
        productManager.add(product1);
    }
}

package com.example.oopwithnlayeredapp.business;

import com.example.oopwithnlayeredapp.dataAccess.ProductDao;
import com.example.oopwithnlayeredapp.entities.Product;

import java.util.List;

public class ProductManager {
    private ProductDao productDao;
    private List[] loggers;

    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
        this.loggers=loggers;
    }

    public void add(Product product) throws Exception {
        //iş kuralları
        if (product.getUnitprice()<10){
            throw  new Exception("ürün fiyatı 10dan küçük olamaz");
        }


        productDao.add(product);

    }
}

package com.example.oopwithnlayeredapp.dataAccess;

import com.example.oopwithnlayeredapp.entities.Product;

public class JdbcProductDao implements ProductDao {
    public void add(Product product){
        //sadece db erişim kodları buraya yazılır.
        System.out.println("JDBC İLE VERİTABANINA EKLENDİ");

    }
}

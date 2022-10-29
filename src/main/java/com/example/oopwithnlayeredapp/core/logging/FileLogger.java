package com.example.oopwithnlayeredapp.core.logging;

public class FileLogger implements Logger {

    @Override
    public void log(String data) {
        System.out.println("Dosyaya Loglandı" +data);


    }
}

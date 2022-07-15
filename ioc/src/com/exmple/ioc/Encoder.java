package com.exmple.ioc;

import java.util.Base64;

public class Encoder {
    private IEncoder iEncoder;

    public Encoder() {}
    public Encoder(IEncoder iEncoder) {
        //this.iEncoder = new Base64Encoder();
        //this.iEncoder = new UrlEncoder();
        this.iEncoder = iEncoder;
    }
    public String encode(String msg) {
        return iEncoder.encode(msg);
    }
}

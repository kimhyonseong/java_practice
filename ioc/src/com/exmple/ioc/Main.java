package com.exmple.ioc;

public class Main {
    public static void main(String[] args) {
        String url = "www.naver.com/book/it?page=10&size=20&name=springboot";

        Encoder encoder = new Encoder(new UrlEncoder());
        String result = encoder.encode(url);

//        IEncoder urlEncoder = new UrlEncoder();
//        String urlResult = urlEncoder.encode(url);

        System.out.println(result);
//        System.out.println(urlResult);
    }
}

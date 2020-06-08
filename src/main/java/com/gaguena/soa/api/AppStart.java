package com.gaguena.soa.api;

import javax.xml.ws.Endpoint;

import com.gaguena.soa.api.ws.ProductWS;

public class AppStart {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9292/ws/products", new ProductWS());
    }
}

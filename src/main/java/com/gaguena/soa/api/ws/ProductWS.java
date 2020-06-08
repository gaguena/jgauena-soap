package com.gaguena.soa.api.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.gaguena.soa.api.data.ProductData;

@WebService(portName = "ProductWSPort", serviceName = "ProductWS", targetNamespace = "http://gaguena.com/wsdl")
public class ProductWS {

    @WebMethod
    public ProductData find(String code) {
        return new ProductData("2121", "Farinha de Trigo", "Farinha de trigo bem moida");
    }
}

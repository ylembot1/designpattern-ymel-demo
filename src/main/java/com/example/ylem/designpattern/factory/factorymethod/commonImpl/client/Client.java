package com.example.ylem.designpattern.factory.factorymethod.commonImpl.client;

import com.example.ylem.designpattern.factory.factorymethod.commonImpl.factory.ConcreteCreator;
import com.example.ylem.designpattern.factory.factorymethod.commonImpl.factory.Creator;
import com.example.ylem.designpattern.factory.factorymethod.commonImpl.product.ConcreteProduct1;
import com.example.ylem.designpattern.factory.factorymethod.commonImpl.product.Product;

public class Client {

    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.createProduct(ConcreteProduct1.class);

    }
}

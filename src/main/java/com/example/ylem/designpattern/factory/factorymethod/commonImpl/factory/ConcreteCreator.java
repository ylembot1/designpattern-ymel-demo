package com.example.ylem.designpattern.factory.factorymethod.commonImpl.factory;

import com.example.ylem.designpattern.factory.factorymethod.commonImpl.product.Product;

public class ConcreteCreator extends Creator {

    @Override
    public <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            // 异常处理
        }

        return (T) product;
    }
}

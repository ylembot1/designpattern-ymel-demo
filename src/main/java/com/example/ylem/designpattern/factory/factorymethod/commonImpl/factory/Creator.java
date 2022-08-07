package com.example.ylem.designpattern.factory.factorymethod.commonImpl.factory;

import com.example.ylem.designpattern.factory.factorymethod.commonImpl.product.Product;

public abstract class Creator {

    // 创建一个产品对象，其输入参数类型可以自行设置
    // 通常为String, Enum, Class等，也可以为空。
    // 这个入参标识了生产的具体对象
    public abstract <T extends Product> T createProduct(Class<T> c);
}

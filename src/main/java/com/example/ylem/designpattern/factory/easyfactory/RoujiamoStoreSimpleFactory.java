package com.example.ylem.designpattern.factory.easyfactory;

import com.example.ylem.designpattern.factory.easyfactory.wupin.RouJiaMo;

/**
 * 肉夹馍分店 - 简单工厂
 */
public class RoujiamoStoreSimpleFactory {
    /**
     * 以组合的方式，让store使用生产肉夹馍的工厂
     */
    private SimpleRouJiaMoFactory factory;

    public RoujiamoStoreSimpleFactory(SimpleRouJiaMoFactory factory) {
        this.factory = factory;
    }

    public RouJiaMo sellRouJiaMo(String type) {
        RouJiaMo rouJiaMo = factory.createRouJiaMo(type);

        rouJiaMo.prepare();
        rouJiaMo.fire();
        rouJiaMo.pack();

        return rouJiaMo;
    }
}

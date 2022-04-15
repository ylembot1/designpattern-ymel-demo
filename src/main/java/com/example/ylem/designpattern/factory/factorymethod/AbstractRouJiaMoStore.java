package com.example.ylem.designpattern.factory.factorymethod;

import com.example.ylem.designpattern.factory.easyfactory.wupin.RouJiaMo;


/**
 * 1、定义了创建对象的一个接口：public abstract RouJiaMo createRouJiaMo(String type);
 *
 * 2、由子类决定实例化的类，可以看到我们的馍是子类生成的。(实例化类的方法到了子类中）
 *
 * 可能有人会说，我用简单工厂模式也行啊，但是如果10来个城市*5种风味/城市，
 * 那么岂不是简单工厂里面需要50多个if，再说人家西安肉夹馍分店就不能有点自己的秘诀，当然由它自己定最好。
 */

public abstract class AbstractRouJiaMoStore {

    public abstract RouJiaMo createRouJiaMo(String type);

    public RouJiaMo sellRouJiaMo(String type) {
        RouJiaMo rouJiaMo = createRouJiaMo(type);

        rouJiaMo.prepare();
        rouJiaMo.fire();
        rouJiaMo.pack();

        return rouJiaMo;
    }
}

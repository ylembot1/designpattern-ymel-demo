
package com.example.ylem.designpattern.factory.factorymethod;

import com.example.ylem.designpattern.factory.easyfactory.wupin.RouJiaMo;

public class BeiJingRouJiaMoStore extends AbstractRouJiaMoStore {

    @Override
    public RouJiaMo createRouJiaMo(String type) {
        RouJiaMo rouJiaMo = null;

        if (type.equals("Suan")) {
            rouJiaMo = new BeiJingSunRouJiaMo();
        } else if (type.equals("Tian")) {
            rouJiaMo = new BeiJingTianRouJiaMo();
        } else if (type.equals("La")) {
            rouJiaMo = new BeiJingLaRouJiaMo();
        }

        return rouJiaMo;
    }
}


class BeiJingSunRouJiaMo extends RouJiaMo {
    public BeiJingSunRouJiaMo() {
        this.name = "酸肉夹馍";
    }
}

class BeiJingTianRouJiaMo extends RouJiaMo {
    public BeiJingTianRouJiaMo() {
        this.name = "甜肉夹馍";
    }
}

class BeiJingLaRouJiaMo extends RouJiaMo {
    public BeiJingLaRouJiaMo() {
        this.name = "辣肉夹馍";
    }
}

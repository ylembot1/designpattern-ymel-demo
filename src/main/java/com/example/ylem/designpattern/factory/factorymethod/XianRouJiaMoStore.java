package com.example.ylem.designpattern.factory.factorymethod;

import com.example.ylem.designpattern.factory.easyfactory.wupin.RouJiaMo;

public class XianRouJiaMoStore extends AbstractRouJiaMoStore {

    @Override
    public RouJiaMo createRouJiaMo(String type) {
        RouJiaMo rouJiaMo = null;

        if (type.equals("Suan")) {
            rouJiaMo = new XianSunRouJiaMo();
        } else if (type.equals("Tian")) {
            rouJiaMo = new XianTianRouJiaMo();
        } else if (type.equals("La")) {
            rouJiaMo = new XianLaRouJiaMo();
        }

        return rouJiaMo;
    }
}


class XianSunRouJiaMo extends RouJiaMo {
    public XianSunRouJiaMo() {
        this.name = "酸肉夹馍";
    }
}

class XianTianRouJiaMo extends RouJiaMo {
    public XianTianRouJiaMo() {
        this.name = "甜肉夹馍";
    }
}

class XianLaRouJiaMo extends RouJiaMo {
    public XianLaRouJiaMo() {
        this.name = "辣肉夹馍";
    }
}

package com.example.ylem.designpattern.factory.easyfactory;

import com.example.ylem.designpattern.factory.easyfactory.wupin.LaRouJiaMo;
import com.example.ylem.designpattern.factory.easyfactory.wupin.RouJiaMo;
import com.example.ylem.designpattern.factory.easyfactory.wupin.SuanRouJiaMo;
import com.example.ylem.designpattern.factory.easyfactory.wupin.TianRouJiaMo;

/**
 * 把生产物品的方法提取出来，放在Factory中生产
 */
public class SimpleRouJiaMoFactory {

    public RouJiaMo createRouJiaMo(String type) {
        RouJiaMo rouJiaMo = null;

        if (type.equals("Suan")) {
            rouJiaMo = new SuanRouJiaMo();
        } else if (type.equals("Tian")) {
            rouJiaMo = new TianRouJiaMo();
        } else if (type.equals("La")) {
            rouJiaMo = new LaRouJiaMo();
        }

        return rouJiaMo;
    }
}

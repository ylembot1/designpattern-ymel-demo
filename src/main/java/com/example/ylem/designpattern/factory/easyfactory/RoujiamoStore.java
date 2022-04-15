package com.example.ylem.designpattern.factory.easyfactory;

import com.example.ylem.designpattern.factory.easyfactory.wupin.LaRouJiaMo;
import com.example.ylem.designpattern.factory.easyfactory.wupin.RouJiaMo;
import com.example.ylem.designpattern.factory.easyfactory.wupin.SuanRouJiaMo;
import com.example.ylem.designpattern.factory.easyfactory.wupin.TianRouJiaMo;

/**
 * 现在这样的设计，虽然可以支持你卖肉夹馍了，但是有点问题，
 * 生产馍的种类和你的RoujiaMoStore耦合度太高了，
 * 如果增加几种风味，删除几种风味，你得一直修改sellRouJiaMo中的方法，
 * 所以我们需要做一定的修改，此时简单工厂模式就能派上用场了。
 */
public class RoujiamoStore {

    /**
     * 选择肉夹馍和制作肉夹馍都放在一起，不好
     * @param type
     * @return
     */
    public RouJiaMo sellRouJiaMo(String type) {
        RouJiaMo rouJiaMo = null;

        if (type.equals("Suan")) {
            rouJiaMo = new SuanRouJiaMo();
        } else if (type.equals("Tian")) {
            rouJiaMo = new TianRouJiaMo();
        } else if (type.equals("La")) {
            rouJiaMo = new LaRouJiaMo();
        }

        rouJiaMo.prepare();
        rouJiaMo.fire();
        rouJiaMo.pack();
        return rouJiaMo;
    }
}

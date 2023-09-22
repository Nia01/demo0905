package com.example.demo0905.module.lazyInitialization;

import java.util.HashMap;
import java.util.Map;

/**
 * 延迟加载产品的工厂类
 */
public class ProductFactory {

    private static final Map<String,Product> prMap = new HashMap<String,Product>();

    public static synchronized Product createProduct(String type){
        Product product = null;
        if (prMap.containsKey(type)){
            product = prMap.get(type);
        }else {
            if (type.equals("product1")){
                product = new ConcreteProduct1();
            }
            if (type.equals("product2")){
                product = new ConcreteProduct2();
            }
            prMap.put(type,product);
        }
        return product;
    }
}

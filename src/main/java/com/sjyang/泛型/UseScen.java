package com.sjyang.泛型;

import java.util.ArrayList;
import java.util.List;

/**
 * @author saijun.yang
 * @date 2020/9/28 19:39
 * @description 泛型使用场景
 */
public class UseScen {
    int add(int a,int b){
        return a+b;
    }
    double add(double a,double b){
        return a+b;
    }
    <T extends Number>double add(T a,T b){
        return a.doubleValue()+b.doubleValue();
    }

    public void noNeedTypeExchange(){
        List<String> a = new ArrayList<String>();
        List b = new ArrayList();
        a.add("c");
        b.add("c");
        System.out.println(a.get(0));
        System.out.println(b.get(0).toString());
    }
}

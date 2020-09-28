package com.sjyang.泛型;

/**
 * @author saijun.yang
 * @date 2020/9/28 19:46
 * @description 泛型类的使用
 */
public class GenericClass<T> {
    private T t;

    public T getT() {
        return t;
    }
    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        GenericClass<String> g = new GenericClass<>();
        g.getT();
    }
}

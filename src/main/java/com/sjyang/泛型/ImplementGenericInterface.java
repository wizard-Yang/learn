package com.sjyang.泛型;

/**
 * @author saijun.yang
 * @date 2020/9/28 19:50
 * @description 实现泛型接口的两种方式
 */
public class ImplementGenericInterface<T> implements GenericInterface<T>{
    @Override
    public T getData() {
        return null;
    }

    public static void main(String[] args) {
        ImplementGenericInterface<Thread> implementGenericInterface = new ImplementGenericInterface<>();
        implementGenericInterface.getData();
    }
}

/**
 * 直接补全类型
 */
class ImplementGenericInterface2 implements GenericInterface<String>{

    @Override
    public String getData() {
        return null;
    }
}

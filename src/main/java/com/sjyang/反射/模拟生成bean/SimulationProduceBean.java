package com.sjyang.反射.模拟生成bean;

/**
 * @author saijun.yang
 * @date 2020/11/13 16:22
 * @description
 */
public class SimulationProduceBean {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<Source> sourceClass = Source.class;
        Base base = (Base)(sourceClass.newInstance());

    }
}

class Source extends Base{
    public String name;

    public Source(String name) {
        this.name = name;
        System.out.println("有参构造方法"+name);
    }

    public Source() {
        System.out.println("无参构造方法");
    }
}

class Base{
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

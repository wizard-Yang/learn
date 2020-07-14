package com.sjyang.反射.Class生成新对象;

/**
 * @author saijun.yang
 * @date 2020/6/23 11:16
 * @description 根据Class类创建一新对象
 * 问题：为什么不使用new创建对象呢？
 * 答：能用new当然用new,但是有时为了满足代码集成或者优化代码，使用这种方式可以让代码更加简洁。
 * 例如：很多类实现了Person类或者接口，我们根据获取Class类型创建对象，这样就可以通过
 * Person p = getClass().newInstance();
 * */
public class ClassNewInstance {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Class<Source> classSource = Source.class;
        Source newSource = (Source)classSource.newInstance();
        System.out.println(newSource.getName());
    }
}
class Source{
    private String name;

    public String getName() {
        System.out.println("我的名字"+name);
        return name;
    }

    public void setName(String name) {
        System.out.println("设置一个新名字"+name);
        this.name = name;
    }
}
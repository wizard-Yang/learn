package com.sjyang.jvm.类加载.被动引用;

/**
 * @author saijun.yang
 * @date 2020/4/23 16:38
 * @description 通过数组定义引用类不会触发初始化操作
 */
public class beidong2 {
    public static void main(String[] args) {
        Resource[] resources = new Resource[0];
    }
}
class Resource{
    static{
        System.out.println("Resource");
    }
}

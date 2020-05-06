package 设计模式.代理模式.cglib;

import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;

/**
 * @author saijun.yang
 * @date 2020/5/6 13:36
 * @description 测试方法
 */
public class Test {
    public static void main(String[] args) {
        // 代理类class文件存入本地磁盘方便我们反编译查看源码
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "E:\\IDEAWorkspace\\learn\\src\\main\\java\\设计模式\\代理模式\\cglib");
        // 通过CGLIB动态代理获取代理对象的过程
        Enhancer enhancer = new Enhancer();
        // 设置enhancer对象的父类
        enhancer.setSuperclass(Tina.class);
        // 设置enhancer的回调对象
        enhancer.setCallback(new TinaHandle());
        // 创建代理对象
        Tina proxy= (Tina)enhancer.create();
        // 通过代理对象调用目标方法
        proxy.sayHello();
    }
}

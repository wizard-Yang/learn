package 设计模式.代理模式.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author saijun.yang
 * @date 2020/5/4 14:41
 * @description 处理器实现类handle
 * 1.需要传入具体的实现类
 * 2.可以增强方法
 */
public class Invoketion implements InvocationHandler {
    private Tina tina;

    public Invoketion(Tina tina){
        this.tina = tina;
    }

    /**
     * 代理类调用的所有方法都会通过该方法去处理
     * 具体处理逻辑根据三个参数进行预处理或分配到委托类实例上反射执行
     * @param proxy 代理类实例
     * @param method 被调用的方法对象
     * @param args 方法的参数
     * @return 该处理handle
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("调用之前增强");
        System.out.println("方法名称："+method);
        Object object = method.invoke(tina,args);
        System.out.println("调用之后加强");
        return object;
    }
}

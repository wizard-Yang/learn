package 设计模式.代理模式.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author saijun.yang
 * @date 2020/5/6 13:28
 * @description 处理类-实际是方法拦截器
 */
public class TinaHandle implements MethodInterceptor {
    /**
     * sub：cglib生成的代理对象
     * method：被代理对象方法
     * objects：方法入参
     * methodProxy: 代理方法
     */
    @Override
    public Object intercept(Object sub, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("前置方法");
        Object object = methodProxy.invokeSuper(sub,objects);
        System.out.println("后置方法");
        return object;
    }
}
